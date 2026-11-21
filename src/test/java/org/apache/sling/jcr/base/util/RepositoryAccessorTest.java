/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.jcr.base.util;

import java.util.Hashtable;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class RepositoryAccessorTest {

    private final RepositoryAccessor accessor = new RepositoryAccessor();

    @Test(expected = UnsupportedOperationException.class)
    public void getRepositoryWithoutContextThrows() {
        accessor.getRepository("repository", null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getRepositoryWithEmptyContextThrows() {
        accessor.getRepository("repository", new Hashtable<String, Object>());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getRepositoryFromURLThrows() {
        accessor.getRepositoryFromURL("repository");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getRepositoryFromNullURLThrows() {
        accessor.getRepositoryFromURL(null);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getLocalAdapterFactoryThrows() {
        accessor.getLocalAdapterFactory();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getClientRepositoryFactoryThrows() {
        accessor.getClientRepositoryFactory();
    }
}
