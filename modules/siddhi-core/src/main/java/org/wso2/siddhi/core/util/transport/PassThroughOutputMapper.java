/*
 * Copyright (c)  2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.siddhi.core.util.transport;

import org.wso2.siddhi.core.event.Event;
import org.wso2.siddhi.core.publisher.OutputMapper;
import org.wso2.siddhi.query.api.definition.StreamDefinition;

import java.util.Map;

/**
 * PassThroughOutputMapper will be used to pass through events without any mapping or modification.
 * To use with testing, manually register this extension to {@link org.wso2.siddhi.core.SiddhiManager}
 * siddhiManager.setExtension("outputmapper:text", PassThroughOutputMapper.class);
 */
public class PassThroughOutputMapper extends OutputMapper {

    @Override
    public void init(StreamDefinition streamDefinition, Map<String, String> options, Map<String, String> unmappedDynamicOptions) {
        // do nothing
    }

    @Override
    public Object convertToTypedInputEvent(Event event, Map<String, String> dynamicOptions) {
        return event;
    }

    @Override
    public Object convertToMappedInputEvent(Event event, String[] mappedAttributes, Map<String, String> dynamicOptions) {
        return event;
    }
}
