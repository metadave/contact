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

package com.basho.contact.mr.keyfilters;

import java.util.HashMap;
import java.util.Map;

import static com.basho.contact.mr.keyfilters.KeyFilter.KeyFilterType.*;

public class KeyFilters {
    static Map<String, KeyFilter> filters = new HashMap<String, KeyFilter>();

    static {
        // transform functions
        addFilter(new KeyFilter("int_to_string"));
        addFilter(new KeyFilter("string_to_int"));
        addFilter(new KeyFilter("float_to_string"));
        addFilter(new KeyFilter("string_to_float"));
        addFilter(new KeyFilter("to_upper"));
        addFilter(new KeyFilter("to_lower"));
        addFilter(new KeyFilter("tokenize", KF_STRING, KF_INT));
        addFilter(new KeyFilter("urldecode"));

        // predicates
        addFilter(new KeyFilter("greater_than", KF_INT));
        addFilter(new KeyFilter("less_than", KF_INT));

        addFilter(new KeyFilter("greater_than_eq", KF_INT));
        addFilter(new KeyFilter("less_than_eq", KF_INT));

        KeyFilter between = new KeyFilter("between", KF_INT, KF_INT, KF_BOOLEAN);
        int[] optionals = {2};
        between.setOptionalArgs(optionals);
        addFilter(between);

        addFilter(new KeyFilter("matches", KF_ANY));
        addFilter(new KeyFilter("neq", KF_ANY));
        addFilter(new KeyFilter("eq", KF_ANY));
        addFilter(new KeyFilter("set_member", KF_ANY_LIST));

        addFilter(new KeyFilter("similar_to", KF_STRING, KF_INT));

        addFilter(new KeyFilter("starts_with", KF_STRING));
        addFilter(new KeyFilter("ends_with", KF_STRING));


        // and, or, not: specified in the lexer
    }

    public static void addFilter(KeyFilter f) {
        filters.put(f.getName(), f);
    }

}
