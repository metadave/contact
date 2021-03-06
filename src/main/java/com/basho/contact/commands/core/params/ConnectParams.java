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

package com.basho.contact.commands.core.params;


import com.basho.contact.actions.ActionParams;
import com.basho.contact.actions.Binding;
import com.basho.riak.client.IRiakClient;

public class ConnectParams {
    public static class Pre extends ActionParams {
        @Binding(name = "riak_host")
        public String host;

        @Binding(name = "riak_pb_port")
        public int pbPort;

        @Binding(name = "conn_id")
        public String conn_id;

        // erlang node name
        @Binding(name = "node_name")
        public String node_name;
    }

    public static class Post extends ActionParams {
        @Binding(name = "riak_host")
        public String host;
        @Binding(name = "riak_pb_port")
        public int pbPort;
        @Binding(name = "riak_client", javadoc = true)
        public IRiakClient client;
    }
}
