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

/** The certificate issuer item containing certificate issuer metadata. */
@Fluent
public final class CertificateIssuerItem implements JsonSerializable<CertificateIssuerItem> {
    /*
     * Certificate Identifier.
     */
    private String id;

    /*
     * The issuer provider.
     */
    private String provider;

    /** Creates an instance of CertificateIssuerItem class. */
    public CertificateIssuerItem() {}

    /**
     * Get the id property: Certificate Identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Certificate Identifier.
     *
     * @param id the id value to set.
     * @return the CertificateIssuerItem object itself.
     */
    public CertificateIssuerItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the provider property: The issuer provider.
     *
     * @return the provider value.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Set the provider property: The issuer provider.
     *
     * @param provider the provider value to set.
     * @return the CertificateIssuerItem object itself.
     */
    public CertificateIssuerItem setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("provider", this.provider);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateIssuerItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateIssuerItem if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateIssuerItem.
     */
    public static CertificateIssuerItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CertificateIssuerItem deserializedCertificateIssuerItem = new CertificateIssuerItem();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            deserializedCertificateIssuerItem.id = reader.getString();
                        } else if ("provider".equals(fieldName)) {
                            deserializedCertificateIssuerItem.provider = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCertificateIssuerItem;
                });
    }
}