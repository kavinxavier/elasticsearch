/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.action.admin.indices.settings;

import org.elasticsearch.cluster.ack.ClusterStateUpdateRequest;
import org.elasticsearch.common.settings.Settings;

/**
 * Cluster state update request that allows to update settings for some indices
 */
public class UpdateSettingsClusterStateUpdateRequest extends ClusterStateUpdateRequest<UpdateSettingsClusterStateUpdateRequest> {
    private Settings settings;
    private String[] indices;

    public UpdateSettingsClusterStateUpdateRequest() {

    }

    /**
     * Returns the indices that needs to be updated
     */
    public String[] indices() {
        return indices;
    }

    /**
     * Sets the indices to update
     */
    public UpdateSettingsClusterStateUpdateRequest indices(String[] indices) {
        this.indices = indices;
        return this;
    }

    /**
     * Returns the {@link Settings} to update
     */
    public Settings settings() {
        return settings;
    }

    /**
     * Sets the {@link Settings} to update
     */
    public UpdateSettingsClusterStateUpdateRequest settings(Settings settings) {
        this.settings = settings;
        return this;
    }
}
