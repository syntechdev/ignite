/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.cache.index;

import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;

/**
 * Test to check work of DML+DDL operations of transactional replicated cache with queries initiated from client node.
 */
public class H2DynamicIndexingComplexClientTransactionalReplicatedTest extends H2DynamicIndexingComplexAbstractTest {
    /**
     * Constructor.
     */
    public H2DynamicIndexingComplexClientTransactionalReplicatedTest() {
        super(CacheMode.REPLICATED, CacheAtomicityMode.TRANSACTIONAL, 1, CLIENT_IDX);
    }
}
