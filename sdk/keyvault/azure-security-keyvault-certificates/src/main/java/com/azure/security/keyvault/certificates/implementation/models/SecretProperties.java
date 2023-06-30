// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Properties of the key backing a certificate. */
@Fluent
public final class SecretProperties implements JsonSerializable<SecretProperties> {
    /*
     * The media type (MIME type).
     */
    private String contentType;

    /** Creates an instance of SecretProperties class. */
    public SecretProperties() {}

    /**
     * Get the contentType property: The media type (MIME type).
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The media type (MIME type).
     *
     * @param contentType the contentType value to set.
     * @return the SecretProperties object itself.
     */
    public SecretProperties setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("contentType", this.contentType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretProperties from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretProperties if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretProperties.
     */
    public static SecretProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    SecretProperties deserializedSecretProperties = new SecretProperties();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("contentType".equals(fieldName)) {
                            deserializedSecretProperties.contentType = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedSecretProperties;
                });
    }
}