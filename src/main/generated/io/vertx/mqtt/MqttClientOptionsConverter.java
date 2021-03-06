/*
 * Copyright (c) 2014 Red Hat, Inc. and others
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.mqtt;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.mqtt.MqttClientOptions}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.mqtt.MqttClientOptions} original class using Vert.x codegen.
 */
public class MqttClientOptionsConverter {

  public static void fromJson(JsonObject json, MqttClientOptions obj) {
    if (json.getValue("autoGeneratedClientId") instanceof Boolean) {
      obj.setAutoGeneratedClientId((Boolean)json.getValue("autoGeneratedClientId"));
    }
    if (json.getValue("autoKeepAlive") instanceof Boolean) {
      obj.setAutoKeepAlive((Boolean)json.getValue("autoKeepAlive"));
    }
    if (json.getValue("cleanSession") instanceof Boolean) {
      obj.setCleanSession((Boolean)json.getValue("cleanSession"));
    }
    if (json.getValue("clientId") instanceof String) {
      obj.setClientId((String)json.getValue("clientId"));
    }
    if (json.getValue("keepAliveTimeSeconds") instanceof Number) {
      obj.setKeepAliveTimeSeconds(((Number)json.getValue("keepAliveTimeSeconds")).intValue());
    }
    if (json.getValue("maxInflightQueue") instanceof Number) {
      obj.setMaxInflightQueue(((Number)json.getValue("maxInflightQueue")).intValue());
    }
    if (json.getValue("maxMessageSize") instanceof Number) {
      obj.setMaxMessageSize(((Number)json.getValue("maxMessageSize")).intValue());
    }
    if (json.getValue("password") instanceof String) {
      obj.setPassword((String)json.getValue("password"));
    }
    if (json.getValue("username") instanceof String) {
      obj.setUsername((String)json.getValue("username"));
    }
    if (json.getValue("willFlag") instanceof Boolean) {
      obj.setWillFlag((Boolean)json.getValue("willFlag"));
    }
    if (json.getValue("willMessage") instanceof String) {
      obj.setWillMessage((String)json.getValue("willMessage"));
    }
    if (json.getValue("willQoS") instanceof Number) {
      obj.setWillQoS(((Number)json.getValue("willQoS")).intValue());
    }
    if (json.getValue("willRetain") instanceof Boolean) {
      obj.setWillRetain((Boolean)json.getValue("willRetain"));
    }
    if (json.getValue("willTopic") instanceof String) {
      obj.setWillTopic((String)json.getValue("willTopic"));
    }
  }

  public static void toJson(MqttClientOptions obj, JsonObject json) {
    json.put("autoGeneratedClientId", obj.isAutoGeneratedClientId());
    json.put("autoKeepAlive", obj.isAutoKeepAlive());
    json.put("cleanSession", obj.isCleanSession());
    if (obj.getClientId() != null) {
      json.put("clientId", obj.getClientId());
    }
    json.put("keepAliveTimeSeconds", obj.getKeepAliveTimeSeconds());
    json.put("maxInflightQueue", obj.getMaxInflightQueue());
    json.put("maxMessageSize", obj.getMaxMessageSize());
    if (obj.getPassword() != null) {
      json.put("password", obj.getPassword());
    }
    if (obj.getUsername() != null) {
      json.put("username", obj.getUsername());
    }
    json.put("willFlag", obj.isWillFlag());
    if (obj.getWillMessage() != null) {
      json.put("willMessage", obj.getWillMessage());
    }
    json.put("willQoS", obj.getWillQoS());
    json.put("willRetain", obj.isWillRetain());
    if (obj.getWillTopic() != null) {
      json.put("willTopic", obj.getWillTopic());
    }
  }
}