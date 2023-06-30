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
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A dictionary of knowledge store-specific configuration properties. Each name is the name of a specific property. Each
 * value must be of a primitive type.
 */
@Fluent
public final class SearchIndexerKnowledgeStoreParameters
        implements JsonSerializable<SearchIndexerKnowledgeStoreParameters> {
    /*
     * Whether or not projections should synthesize a generated key name if one isn't already present.
     */
    private Boolean synthesizeGeneratedKeyName;

    /*
     * A dictionary of knowledge store-specific configuration properties. Each name is the name of a specific property.
     * Each value must be of a primitive type.
     */
    private Map<String, Object> additionalProperties;

    /** Creates an instance of SearchIndexerKnowledgeStoreParameters class. */
    public SearchIndexerKnowledgeStoreParameters() {}

    /**
     * Get the synthesizeGeneratedKeyName property: Whether or not projections should synthesize a generated key name if
     * one isn't already present.
     *
     * @return the synthesizeGeneratedKeyName value.
     */
    public Boolean isSynthesizeGeneratedKeyName() {
        return this.synthesizeGeneratedKeyName;
    }

    /**
     * Set the synthesizeGeneratedKeyName property: Whether or not projections should synthesize a generated key name if
     * one isn't already present.
     *
     * @param synthesizeGeneratedKeyName the synthesizeGeneratedKeyName value to set.
     * @return the SearchIndexerKnowledgeStoreParameters object itself.
     */
    public SearchIndexerKnowledgeStoreParameters setSynthesizeGeneratedKeyName(Boolean synthesizeGeneratedKeyName) {
        this.synthesizeGeneratedKeyName = synthesizeGeneratedKeyName;
        return this;
    }

    /**
     * Get the additionalProperties property: A dictionary of knowledge store-specific configuration properties. Each
     * name is the name of a specific property. Each value must be of a primitive type.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A dictionary of knowledge store-specific configuration properties. Each
     * name is the name of a specific property. Each value must be of a primitive type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SearchIndexerKnowledgeStoreParameters object itself.
     */
    public SearchIndexerKnowledgeStoreParameters setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("synthesizeGeneratedKeyName", this.synthesizeGeneratedKeyName);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerKnowledgeStoreParameters from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerKnowledgeStoreParameters if the JsonReader was pointing to an instance of it,
     *     or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SearchIndexerKnowledgeStoreParameters.
     */
    public static SearchIndexerKnowledgeStoreParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    SearchIndexerKnowledgeStoreParameters deserializedSearchIndexerKnowledgeStoreParameters =
                            new SearchIndexerKnowledgeStoreParameters();
                    Map<String, Object> additionalProperties = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("synthesizeGeneratedKeyName".equals(fieldName)) {
                            deserializedSearchIndexerKnowledgeStoreParameters.synthesizeGeneratedKeyName =
                                    reader.getNullable(JsonReader::getBoolean);
                        } else {
                            if (additionalProperties == null) {
                                additionalProperties = new LinkedHashMap<>();
                            }

                            additionalProperties.put(fieldName, reader.readUntyped());
                        }
                    }
                    deserializedSearchIndexerKnowledgeStoreParameters.additionalProperties = additionalProperties;

                    return deserializedSearchIndexerKnowledgeStoreParameters;
                });
    }
}