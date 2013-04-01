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

import com.basho.contact.actions.ActionParams;
import com.basho.contact.symbols.ContactSymbol;
import com.basho.riak.client.IRiakClient;

public abstract class RiakCommand<K extends ContactSymbol<?>, O extends ActionParams> {
    public O params;
    private Class<O> clazz;
    protected IRiakClient conn;

    protected abstract K exec(RuntimeContext ctx);

    public final K doExec(RuntimeContext ctx) {
        if(checkAccess(ctx)) {
            if(this.params.connection_id != null) {
                conn = ctx.getConnectionProvider().getClientByName(this.params.connection_id, ctx);
            } else {
                conn = ctx.getConnectionProvider().getDefaultClient(ctx);
            }
            return exec(ctx);
        } else {
            return null;
        }
    }

    public boolean checkAccess(RuntimeContext ctx) {
        return ctx.getAccessPolicy().canAccess(this.getClass(), null);
    }

    public RiakCommand(Class<O> c) {
        clazz = c;
        try {
            params = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}