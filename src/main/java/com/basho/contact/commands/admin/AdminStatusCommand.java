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

import java.util.Iterator;

public class AdminStatusCommand extends AdminCommand {
    public AdminStatusCommand() {
        super("riak_kv_status", "statistics");
    }

    @Override
    public OtpErlangList preprocess(RuntimeContext ctx, String connid) {
        return new OtpErlangList();
    }

    @Override
    public void postprocess(RuntimeContext ctx, OtpErlangObject result) {
        OtpErlangList l = (OtpErlangList)result;
        Iterator<OtpErlangObject> it = l.iterator();
        while(it.hasNext()) {
            OtpErlangTuple o = (OtpErlangTuple)it.next();
            OtpErlangAtom k = (OtpErlangAtom)o.elementAt(0);
            OtpErlangObject obj = o.elementAt(1);

            String val;
            if(obj instanceof OtpErlangBinary) {
                val = new String(((OtpErlangBinary) obj).binaryValue());
            } else {
                val = obj.toString();
            }
            System.out.println(k + ": " + val);
        }
    }
}
