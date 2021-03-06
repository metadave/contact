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

import com.basho.contact.symbols.ContactSymbol;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ContactExecutor {

    ExecutorService executor = Executors.newFixedThreadPool(10);

    Future<?> currentFuture = null;

    public Future<?> submitTask(Callable<? extends ContactSymbol<?>> task) {
        currentFuture = executor.submit(task);
        return currentFuture;
    }

    public Future<?> getCurrentFuture() {
        return currentFuture;
    }

    public void cleanCurrentFuture() {
        currentFuture = null;
    }
}
