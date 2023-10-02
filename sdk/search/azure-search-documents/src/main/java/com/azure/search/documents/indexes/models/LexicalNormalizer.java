// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Base type for normalizers. */
@Immutable
public class LexicalNormalizer implements JsonSerializable<LexicalNormalizer> {
    /*
     * The name of the normalizer. It must only contain letters, digits, spaces, dashes or underscores, can only start
     * and end with alphanumeric characters, and is limited to 128 characters. It cannot end in '.microsoft' nor
     * '.lucene', nor be named 'asciifolding', 'standard', 'lowercase', 'uppercase', or 'elision'.
     */
    private final String name;

    /**
     * Creates an instance of LexicalNormalizer class.
     *
     * @param name the name value to set.
     */
    public LexicalNormalizer(String name) {
        this.name = name;
    }

    /**
     * Get the name property: The name of the normalizer. It must only contain letters, digits, spaces, dashes or
     * underscores, can only start and end with alphanumeric characters, and is limited to 128 characters. It cannot end
     * in '.microsoft' nor '.lucene', nor be named 'asciifolding', 'standard', 'lowercase', 'uppercase', or 'elision'.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LexicalNormalizer from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of LexicalNormalizer if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the LexicalNormalizer.
     */
    public static LexicalNormalizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    String discriminatorValue = null;
                    JsonReader readerToUse = reader.bufferObject();

                    readerToUse.nextToken(); // Prepare for reading
                    while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = readerToUse.getFieldName();
                        readerToUse.nextToken();
                        if ("@odata.type".equals(fieldName)) {
                            discriminatorValue = readerToUse.getString();
                            break;
                        } else {
                            readerToUse.skipChildren();
                        }
                    }

                    if (discriminatorValue != null) {
                        readerToUse = readerToUse.reset();
                    }
                    // Use the discriminator value to determine which subtype should be deserialized.
                    if ("#Microsoft.Azure.Search.CustomNormalizer".equals(discriminatorValue)) {
                        return CustomNormalizer.fromJson(readerToUse);
                    } else {
                        throw new IllegalStateException(
                                "Discriminator field '@odata.type' didn't match one of the expected values '#Microsoft.Azure.Search.CustomNormalizer'");
                    }
                });
    }
}