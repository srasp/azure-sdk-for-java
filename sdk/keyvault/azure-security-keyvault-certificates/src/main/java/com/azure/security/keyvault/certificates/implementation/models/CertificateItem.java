// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.certificates.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.Base64Url;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/** The certificate item containing certificate metadata. */
@Fluent
public class CertificateItem implements JsonSerializable<CertificateItem> {
    /*
     * Certificate identifier.
     */
    private String id;

    /*
     * The certificate management attributes.
     */
    private CertificateAttributes attributes;

    /*
     * Application specific metadata in the form of key-value pairs.
     */
    private Map<String, String> tags;

    /*
     * Thumbprint of the certificate.
     */
    private Base64Url x509Thumbprint;

    /** Creates an instance of CertificateItem class. */
    public CertificateItem() {}

    /**
     * Get the id property: Certificate identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Certificate identifier.
     *
     * @param id the id value to set.
     * @return the CertificateItem object itself.
     */
    public CertificateItem setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the attributes property: The certificate management attributes.
     *
     * @return the attributes value.
     */
    public CertificateAttributes getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The certificate management attributes.
     *
     * @param attributes the attributes value to set.
     * @return the CertificateItem object itself.
     */
    public CertificateItem setAttributes(CertificateAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the tags property: Application specific metadata in the form of key-value pairs.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: Application specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set.
     * @return the CertificateItem object itself.
     */
    public CertificateItem setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the x509Thumbprint property: Thumbprint of the certificate.
     *
     * @return the x509Thumbprint value.
     */
    public byte[] getX509Thumbprint() {
        if (this.x509Thumbprint == null) {
            return null;
        }
        return this.x509Thumbprint.decodedBytes();
    }

    /**
     * Set the x509Thumbprint property: Thumbprint of the certificate.
     *
     * @param x509Thumbprint the x509Thumbprint value to set.
     * @return the CertificateItem object itself.
     */
    public CertificateItem setX509Thumbprint(byte[] x509Thumbprint) {
        if (x509Thumbprint == null) {
            this.x509Thumbprint = null;
        } else {
            this.x509Thumbprint = Base64Url.encode(CoreUtils.clone(x509Thumbprint));
        }
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("attributes", this.attributes);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("x5t", Objects.toString(this.x509Thumbprint, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CertificateItem from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CertificateItem if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the CertificateItem.
     */
    public static CertificateItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    CertificateItem deserializedCertificateItem = new CertificateItem();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("id".equals(fieldName)) {
                            deserializedCertificateItem.id = reader.getString();
                        } else if ("attributes".equals(fieldName)) {
                            deserializedCertificateItem.attributes = CertificateAttributes.fromJson(reader);
                        } else if ("tags".equals(fieldName)) {
                            Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                            deserializedCertificateItem.tags = tags;
                        } else if ("x5t".equals(fieldName)) {
                            deserializedCertificateItem.x509Thumbprint =
                                    reader.getNullable(nonNullReader -> new Base64Url(nonNullReader.getString()));
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedCertificateItem;
                });
    }
}