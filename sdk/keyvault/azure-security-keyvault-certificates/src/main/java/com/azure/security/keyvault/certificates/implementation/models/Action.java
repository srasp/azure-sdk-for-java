// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.certificates.models.CertificatePolicyAction;
import java.io.IOException;
import java.util.Objects;

/** The action that will be executed. */
@Fluent
public final class Action implements JsonSerializable<Action> {
    /*
     * The type of the action.
     */
    private CertificatePolicyAction actionType;

    /** Creates an instance of Action class. */
    public Action() {}

    /**
     * Get the actionType property: The type of the action.
     *
     * @return the actionType value.
     */
    public CertificatePolicyAction getActionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: The type of the action.
     *
     * @param actionType the actionType value to set.
     * @return the Action object itself.
     */
    public Action setActionType(CertificatePolicyAction actionType) {
        this.actionType = actionType;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("action_type", Objects.toString(this.actionType, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Action from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Action if the JsonReader was pointing to an instance of it, or null if it was pointing to
     *     JSON null.
     * @throws IOException If an error occurs while reading the Action.
     */
    public static Action fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Action deserializedAction = new Action();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("action_type".equals(fieldName)) {
                            deserializedAction.actionType = CertificatePolicyAction.fromString(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedAction;
                });
    }
}