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

import java.util.List;

public class Query2iParams {
    public static class Pre extends ActionParams {
        @Binding(name = "index_name")
        public String indexName;

        @Binding(name = "index_val")
        public String indexVal;

        @Binding(name = "index_min")
        public String min;

        @Binding(name = "index_max")
        public String max;

        @Binding(name = "doFetch")
        public boolean doFetch = false;
    }

    public static class Post extends ActionParams {
        @Binding(name = "index_name")
        public String indexName;

        @Binding(name = "index_val")
        public String indexVal;

        @Binding(name = "index_min")
        public String min;

        @Binding(name = "index_max")
        public String max;

        @Binding(name = "results")
        public List<?> results;
    }
}
