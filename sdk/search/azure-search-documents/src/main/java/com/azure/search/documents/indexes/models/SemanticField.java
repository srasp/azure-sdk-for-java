// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** A field that is used as part of the semantic configuration. */
@Fluent
public final class SemanticField implements JsonSerializable<SemanticField> {
    /*
     * The fieldName property.
     */
    private String fieldName;

    /** Creates an instance of SemanticField class. */
    public SemanticField() {}

    /**
     * Get the fieldName property: The fieldName property.
     *
     * @return the fieldName value.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Set the fieldName property: The fieldName property.
     *
     * @param fieldName the fieldName value to set.
     * @return the SemanticField object itself.
     */
    public SemanticField setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fieldName", this.fieldName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SemanticField from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SemanticField if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the SemanticField.
     */
    public static SemanticField fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    SemanticField deserializedSemanticField = new SemanticField();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String jsonFieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("fieldName".equals(jsonFieldName)) {
                            deserializedSemanticField.fieldName = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedSemanticField;
                });
    }
}