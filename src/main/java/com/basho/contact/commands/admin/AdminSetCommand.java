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

public class AdminSetCommand extends AdminCommand {

    String app;
    String param;
    Object val;

    public AdminSetCommand(String app, String param, Object val) {
        super("application", "set_env");
        this.app = app;
        this.param = param;
        this.val = val;
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        OtpErlangObject v = null;
        if(val instanceof String) {
            v = new OtpErlangString(val.toString());
        } else if(val instanceof Integer) {
            v = new OtpErlangInt(((Integer) val).intValue());
        } else if(val instanceof Boolean) {
            v = new OtpErlangBoolean(((Boolean) val).booleanValue());
        }

        OtpErlangObject[] objs = {new OtpErlangAtom(app),
                                  new OtpErlangAtom(param), v };
        return new OtpErlangList(objs);
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        System.out.println(result);
    }
}
