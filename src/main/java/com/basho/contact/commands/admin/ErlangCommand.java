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

package com.basho.contact.commands.admin;

import com.basho.contact.RuntimeContext;
import com.ericsson.otp.erlang.*;

import java.util.List;

public abstract class ErlangCommand {
    protected String module;
    protected String function;
    protected OtpSelf self;

    public ErlangCommand(String m, String f) {
        this.module = m;
        this.function = f;
    }

    public abstract OtpErlangList preprocess(RuntimeContext ctx, String connid);
    public abstract void postprocess(RuntimeContext ctx, OtpErlangObject result);

    // TODO don't use an arity 3 here...
    public void doExec(RuntimeContext ctx, String connid, String clusterid) {
        try {
            self = new OtpSelf("riak_jmx@127.0.0.1", "riak");
            if(clusterid != null) {
                //String erlnode = ctx.getConnectionProvider().getNodeNameForClient(connid);
                System.out.println("Cluster exec...");
                List<String> peers = ctx.getDefinedClusterNodes(clusterid);
                for(String peer: peers) {
                    System.out.println("[" + peer + "]");
                    OtpPeer riak = new OtpPeer(peer);
                    OtpConnection connection = self.connect(riak);
                    //connection.setTraceLevel(5);
                    OtpErlangList params = preprocess(ctx, connid);
                    //System.out.println(params);
                    connection.sendRPC(module,function,params);
                    OtpErlangObject result = connection.receiveRPC();
                    postprocess(ctx, result);
                    connection.close();
                }
            } else {
                //System.out.println("Node exec");
                String erlnode = ctx.getConnectionProvider().getNodeNameForClient(connid);

                //System.out.println("ERLNODE = " + erlnode);
                OtpPeer riak = new OtpPeer(erlnode);
                OtpConnection connection = self.connect(riak);
                //connection.setTraceLevel(5);
                OtpErlangList params = preprocess(ctx, connid);
                //System.out.println(params);
                connection.sendRPC(module,function,params);
                OtpErlangObject result = connection.receiveRPC();
                postprocess(ctx, result);
                connection.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            ctx.appendError(e);
        }
    }
}
