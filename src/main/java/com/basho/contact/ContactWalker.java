/*
 * -------------------------------------------------------------------
 * Contact: a language and interactive shell for Riak
 *
 * Copyright (c) 2013 Dave Parfitt
 *
 * This file is provided to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * -------------------------------------------------------------------
 */

package com.basho.contact;

import com.basho.contact.commands.RiakCommand;
import com.basho.contact.commands.core.*;
import com.basho.contact.parser.*;
import com.basho.contact.parser.ContactParser.*;
import com.basho.contact.symbols.ContactSymbol;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class ContactWalker extends ContactBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    public RuntimeContext runtimeCtx = null;

    public ContactWalker(RuntimeContext ctx) {
        this.runtimeCtx = ctx;
    }

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }


    @Override
    public void exitAssignment(AssignmentContext ctx) {
        if (ctx.name != null) {
            setValue(ctx, ctx.name.getText());
        }
    }


    @Override
    public void exitConnection_selector(Connection_selectorContext ctx) {
        setValue(ctx, ctx.connname.getText());
    }

    @Override
    public void exitConnections(ConnectionsContext ctx) {
        ConnectionsCommand cmd = new ConnectionsCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitUsing(UsingContext ctx) {
        String bucket = ParseUtils.stripQuotes(ctx.bucket.getText());
        Object o = getValue(ctx.op_with_options());
        if (o instanceof RiakCommand) {
            RiakCommand<?, ?> c = (RiakCommand<?, ?>) o;
            c.params.bucket = bucket;
        }
        trace("Using bucket " + bucket);
        setValue(ctx, o);
    }

    @Override
    public void exitStat(StatContext ctx) {
        Object o = null;
        if (ctx.op_with_options() != null) {
            o = getValue(ctx.op_with_options());
        } else if (ctx.using() != null) {
            o = getValue(ctx.using());
        } else if (ctx.listbuckets() != null) {
            o = getValue(ctx.listbuckets());
        } else if (ctx.connect() != null) {
            o = getValue(ctx.connect());
        } else if (ctx.console_op() != null) {
            o = getValue(ctx.console_op());
        } else if (ctx.connections() != null) {
            o = getValue(ctx.connections());
        }

        if(runtimeCtx.isParseError()) {
            return;
        }

        if (o != null) {
            //System.out.println("Executing " + o.getClass().getName());
            if (o instanceof RiakCommand) {
                RiakCommand<?, ?> cmd = (RiakCommand<?, ?>) o;

                if(ctx.connection_selector() != null) {
                    String conn_id = (String)getValue(ctx.connection_selector());
                    System.out.println("Using connection " + conn_id);
                    cmd.params.connection_id = conn_id;
                }
                if (cmd.params.bucket == null) {
                    cmd.params.bucket = runtimeCtx.getCurrentBucket();
                }
                cmd.params.ctx = runtimeCtx;
                ContactSymbol<?> sym = cmd.doExec(runtimeCtx);
                runtimeCtx.lastResult = sym;
                if (ctx.assignment() != null) {
                    String name = (String) getValue(ctx.assignment());
                    runtimeCtx.bind(name, runtimeCtx.lastResult);
                }
                setValue(ctx, sym);

            }
        }
    }

    @Override
    public void exitCode_string(Code_stringContext ctx) {
        String value;
        if (ctx.STRING() != null) {
            value = ParseUtils.stripQuotes(ctx.STRING().getText());
        } else {
            value = ParseUtils.getDataContent(ctx.DATA_CONTENT().getText());
        }
        setValue(ctx, value);
    }

    @Override
    public void exitConsole_op(Console_opContext ctx) {
        if (ctx.get() != null) {
            setValue(ctx, getValue(ctx.get()));
        } else if (ctx.set() != null) {
            setValue(ctx, getValue(ctx.set()));
        }
    }

    @Override
    public void exitGet(GetContext ctx) {
        if (ctx.get_action() != null) {
            setValue(ctx, getValue(ctx.get_action()));
        } else if(ctx.BUCKET() != null) {
                // TODO: This would be better in stmt.
                GetBucketCommand cmd = new GetBucketCommand();
                cmd.params.bucket = runtimeCtx.getCurrentBucket();
                cmd.params.ctx = runtimeCtx;
                ContactSymbol<?> sym = cmd.doExec(runtimeCtx);
                runtimeCtx.lastResult = sym;
                setValue(ctx, sym);
        }
    }

    @Override
    public void exitGet_action(Get_actionContext ctx) {
        String action = ctx.actionname.getText();
        if (runtimeCtx.getJSActionListener().getAvailableActions().contains(action)) {
            // print this directly to the console
            System.out.println(runtimeCtx.getJSActionListener().getJSBody(action));
        } else {
            runtimeCtx.appendError(action + " is an invalid action");
        }
    }

    @Override
    public void exitSet_action(Set_actionContext ctx) {
        String action = ctx.actionname.getText();
        String code = (String) getValue(ctx.code_string());
        if (runtimeCtx.getJSActionListener().getAvailableActions().contains(action)) {
            // print this directly to the console
            runtimeCtx.getJSActionListener().setJSBody(action, code);
        } else {
            runtimeCtx.appendError(action + " is an invalid action");
        }
    }



    @SuppressWarnings("unchecked")
    @Override
    public void exitOp_with_options(Op_with_optionsContext ctx) {
        Object options = getValue(ctx.options());
        Object o = null;
        Map<String, String> bucketOptions = null;

        if (ctx.fetch() != null) {
            o = getValue(ctx.fetch());
            bucketOptions = runtimeCtx.getCurrentFetchOptions();
        } else if (ctx.store() != null) {
            o = getValue(ctx.store());
            bucketOptions = runtimeCtx.getCurrentStoreOptions();
        } else if (ctx.delete() != null) {
            o = getValue(ctx.delete());
            bucketOptions = runtimeCtx.getCurrentDeleteOptions();
        } else if (ctx.query2i() != null) {
            o = getValue(ctx.query2i());
            bucketOptions = runtimeCtx.getCurrentQuery2iOptions();
        } else if (ctx.listkeys() != null) {
            o = getValue(ctx.listkeys());
        } else if(ctx.countkeys() != null) {
            o = getValue(ctx.countkeys());
        } else if(ctx.bucketprops() != null) {
            o = getValue(ctx.bucketprops());
        }

        if (o instanceof RiakCommand) {
            RiakCommand<?, ?> c = (RiakCommand<?, ?>) o;
            if(bucketOptions != null && bucketOptions.size() > 0) {
                if(!(o instanceof SetBucketPropsCommand)) {
                    Map<String, String> combined = new HashMap<String, String>();
                    // use all bucket options, then override with any options from
                    // curent command
                    combined.putAll(bucketOptions);
                    combined.putAll((Map<String, String>) options);
                    c.params.options = combined;
                }
            } else {
                if(!(o instanceof SetBucketPropsCommand)) {
                    c.params.options = (Map<String, String>) options;
                }
            }
            setValue(ctx, c);
        }
    }


    @Override
    public void exitFetch(FetchContext ctx) {
        FetchCommand fetch = new FetchCommand();
        fetch.params.key = ParseUtils.stripQuotes(ctx.key.getText());
        fetch.params.fetchMetadataSelection = (List<String>)getValue(ctx.fetch_select());
        setValue(ctx, fetch);
    }


    @Override
    public void exitFetch_select(Fetch_selectContext ctx) {
        setValue(ctx, getValue(ctx.id_list()));

    }

    @Override
    public void exitId_list(Id_listContext ctx) {
        List<String> str_ids = new ArrayList<String>();
        for(Token t : ctx.ids) {
             str_ids.add(t.getText());
        }
        setValue(ctx, str_ids);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void exitStore(StoreContext ctx) {
        StoreCommand store = new StoreCommand();
        store.params.key = ParseUtils.stripQuotes(ctx.key.getText());
        store.params.content = (Content) getValue(ctx.content_string());
        if (ctx.store_indexes() != null) {
            List<PairContext> pctxs = (List<PairContext>) getValue(ctx.store_indexes());
            List<Pair> indexes = new ArrayList<Pair>();
            for (PairContext pc : pctxs) {
                indexes.add((Pair) getValue(pc));
            }
            store.params.indexes = indexes;
        }
        setValue(ctx, store);
    }

    @Override
    public void exitContent_string(Content_stringContext ctx) {
        String value = "";

        if (ctx.STRING() != null) {
            value = ParseUtils.stripQuotes(ctx.STRING().getText());
        } else if (ctx.DATA_CONTENT() != null) {
            value = ParseUtils.getDataContent(ctx.DATA_CONTENT().getText());
        }

        if (ctx.JSON() != null) {
            setValue(ctx, new Content(Content.ContentType.JSON, value));
        } else if (ctx.TEXT() != null) {
            setValue(ctx, new Content(Content.ContentType.TEXT, value));
        } else if (ctx.XML() != null) {
            setValue(ctx, new Content(Content.ContentType.XML, value));
        } else if(ctx.user_content() != null) {
            String userDefinedContentType = (String)getValue(ctx.user_content());
            setValue(ctx, new Content(Content.ContentType.USER_DEFINED, userDefinedContentType, value));
        }
    }

    @Override
    public void exitUser_content(User_contentContext ctx) {
        setValue(ctx, ParseUtils.stripQuotes(ctx.content_type.getText()));
    }

    @Override
    public void exitDelete(DeleteContext ctx) {
        DeleteCommand cmd = new DeleteCommand();
        cmd.params.key = ParseUtils.stripQuotes(ctx.key.getText());
        setValue(ctx, cmd);
    }

    @Override
    public void exitQuery2i(Query2iContext ctx) {
        Query2iCommand query = new Query2iCommand();
        query.params.indexName = ParseUtils.stripQuotes(ctx.index.getText());
        if (ctx.exact != null) {
            query.params.indexVal = ParseUtils.stripQuotes(ctx.exact.getText());
        } else {
            query.params.min = ParseUtils.stripQuotes(ctx.vmin.getText());
            query.params.max = ParseUtils.stripQuotes(ctx.vmax.getText());
        }
        if(ctx.FETCH() != null) {
            query.params.doFetch = true;
        }

        setValue(ctx, query);
    }


    @Override
    public void exitOptionslist(OptionslistContext ctx) {
        Map<String, Object> pairs = new HashMap<String, Object>();
        for (PairContext pc : ctx.opts) {
            Pair p = (Pair) getValue(pc);
            pairs.put(p.getKey(), p.getValue());
        }
        setValue(ctx, pairs);
    }

    @Override
    public void exitOptions(OptionsContext ctx) {
        setValue(ctx, getValue(ctx.optionslist()));
    }


    @Override
    public void exitPair(PairContext ctx) {
        String s = (String)getValue(ctx.pairValue());
        if (ctx.name != null) {
            String name = ParseUtils.stripQuotes(ctx.name.getText());
            Pair p = new Pair(name, s);
            setValue(ctx, p);
        } else {
            String name = ctx.id.getText();
            Pair p = new Pair(name, s);
            setValue(ctx, p);
        }
    }

    @Override
    public void exitPairStringValue(PairStringValueContext ctx) {
        setValue(ctx, ParseUtils.stripQuotes(ctx.stringValue.getText()));
    }

    @Override
    public void exitPairIntValue(PairIntValueContext ctx) {
        setValue(ctx, ctx.intValue.getText());
    }

    @Override
    public void exitPairBoolValue(PairBoolValueContext ctx) {
        setValue(ctx, ctx.boolValue.getText());
    }


    @Override
    public void exitConnect(ConnectContext ctx) {
        String hostAndPort = ParseUtils.stripQuotes(ctx.host.getText());
        ConnectCommand command = new ConnectCommand();
        if(ctx.pbport != null) {
            // for backwards compat
            int pbPort = Integer.parseInt(ctx.pbport.getText());
            command.params.host = hostAndPort;
            command.params.pbPort = pbPort;
            runtimeCtx.appendError("'connect \"host\" pb port' has been deprecated in favor of 'connect \"host:port\"'");
        } else {
           // don't worry about the port # here,
           // Antlr already made sure it was a valid int
           String chunks[] = hostAndPort.split(":");
           String host = chunks[0];
           String port = chunks[1];
            // TODO: check for invalid IP:PORT combos
            int pbPort = Integer.parseInt(chunks[1]);
           command.params.host = host;
           command.params.pbPort = pbPort;
        }

        if(ctx.connname != null) {
            command.params.conn_id = ctx.connname.getText();

        }
        if(ctx.erlnode != null) {
            String erlnode = ParseUtils.stripQuotes(ctx.erlnode.getText());
            command.params.node_name = erlnode;
        }

        setValue(ctx, command);
    }


    private void trace(String msg) {
        if (runtimeCtx.trace) {
            System.out.println("TRACE:" + msg);
        }
    }

    @Override
    public void exitStore_indexes(Store_indexesContext ctx) {
        if (ctx.pair() != null) {
            List<PairContext> pctxs = ctx.pair();
            setValue(ctx, pctxs);
        }
    }

    @Override
    public void exitListbuckets(ListbucketsContext ctx) {
        ListBucketsCommand listBuckets = new ListBucketsCommand();
        setValue(ctx, listBuckets);
    }

    @Override
    public void exitListkeys(ListkeysContext ctx) {
        ListKeysCommand listKeys = new ListKeysCommand();
        setValue(ctx, listKeys);
    }

    @Override
    public void exitUse(UseContext ctx) {
        if (ctx.BUCKET() != null) {
            String bucket = ParseUtils.stripQuotes(ctx.name.getText());
            runtimeCtx.setCurrentBucket(bucket);
            if(ctx.useBucketOptions() != null && getValue(ctx.useBucketOptions()) != null) {
                String scriptBody = (String)getValue(ctx.useBucketOptions());
                runtimeCtx.getActionListener().getResolverMill().defineResolver(bucket, scriptBody);
            }
        }
    }

    @Override
    public void exitUseBucketOptions(UseBucketOptionsContext ctx) {
        if(ctx.FETCH() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> fo = (Map<String, String>)getValue(ctx.fetchOptions);
            runtimeCtx.setCurrentFetchOptions(fo);
            System.out.println("Fetch options =" + fo);
        } else {
            runtimeCtx.setCurrentFetchOptions(new HashMap<String, String>());
        }

        if(ctx.STORE() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> so = (Map<String, String>)getValue(ctx.storeOptions);
            runtimeCtx.setCurrentStoreOptions(so);
            System.out.println("Store options =" + so);
        } else {
            runtimeCtx.setCurrentStoreOptions(new HashMap<String, String>());
        }

        if(ctx.DELETE() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> del_o = (Map<String, String>)getValue(ctx.deleteOptions);
            runtimeCtx.setCurrentDeleteOptions(del_o);
            System.out.println("Delete options =" + del_o);
        } else {
            runtimeCtx.setCurrentDeleteOptions(new HashMap<String, String>());
        }

        if(ctx.QUERY2I() != null) {
            @SuppressWarnings("unchecked")
            Map<String, String> qo = (Map<String, String>)getValue(ctx.query2iOptions);
            runtimeCtx.setCurrentQuery2iOptions(qo);
            System.out.println("Query2i options =" + qo);
        } else {
            runtimeCtx.setCurrentQuery2iOptions(new HashMap<String, String>());
        }
        if(ctx.RESOLVER() != null) {
            setValue(ctx, getValue(ctx.code_string()));
        } else {
            // TODO: clear resolver!
            //runtimeCtx.getActionListener().getResolverMill().clearResolver();
        }
    }

    @Override
    public void exitCountkeys(CountkeysContext ctx) {
        CountKeysCommand cmd = new CountKeysCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitLoadscript(LoadscriptContext ctx) {
        String filename = ParseUtils.stripQuotes(ctx.filename.getText());
        runtimeCtx.getActionListener().loadScript(filename);
    }

    @Override
    public void exitScript(ScriptContext ctx) {
        String content = "";
        if(ctx.DATA_CONTENT() != null) {
            content = ParseUtils.getDataContent(ctx.DATA_CONTENT().getText());
        } else {
            content = ParseUtils.stripQuotes(ctx.STRING().getText());
        }
        runtimeCtx.getActionListener().evalScript(content);
    }


    @Override
    public void exitBucketprops(BucketpropsContext ctx) {
        if(ctx.get_bucketprops() != null) {
            setValue(ctx, getValue(ctx.get_bucketprops()));
        } else {
            setValue(ctx, getValue(ctx.set_bucketprops()));
        }
    }

    @Override
    public void exitGet_bucketprops(Get_bucketpropsContext ctx) {
        GetBucketPropsCommand cmd = new GetBucketPropsCommand();
        setValue(ctx, cmd);
    }

    @Override
    public void exitSet_bucketprops(Set_bucketpropsContext ctx) {
        SetBucketPropsCommand cmd = new SetBucketPropsCommand();
        // TODO: <String, Object> vs <String, String>
        // I would prefer <String, String>
        cmd.params.options = (Map<String, String>)getValue(ctx.optionslist());
        setValue(ctx, cmd);
    }
}
