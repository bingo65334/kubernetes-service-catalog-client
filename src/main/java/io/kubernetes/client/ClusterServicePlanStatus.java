/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.kubernetes.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClusterServicePlanStatus represents status information about a
 * ClusterServicePlan.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ClusterServicePlanStatus {
    private boolean removedFromBrokerCatalog;

    /**
     * RemovedFromBrokerCatalog indicates that the broker removed the plan from
     * its catalog.
     *
     * @return boolean
     */
    @JsonProperty("removedFromBrokerCatalog")
    public boolean isRemovedFromBrokerCatalog() {
        return removedFromBrokerCatalog;
    }

    @JsonProperty("removedFromBrokerCatalog")
    public void setRemovedFromBrokerCatalog(boolean removedFromBrokerCatalog) {
        this.removedFromBrokerCatalog = removedFromBrokerCatalog;
    }

    @Override
    public String toString() {
        return "ClusterServicePlanStatus [removedFromBrokerCatalog=" + removedFromBrokerCatalog + "]";
    }
}