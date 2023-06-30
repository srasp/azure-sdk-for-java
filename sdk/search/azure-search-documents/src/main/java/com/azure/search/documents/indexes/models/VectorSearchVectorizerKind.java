// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/** The vectorization method to be used during query time. */
public final class VectorSearchVectorizerKind extends ExpandableStringEnum<VectorSearchVectorizerKind> {
    /** Generate embeddings using an Azure Open AI service at query time. */
    public static final VectorSearchVectorizerKind AZURE_OPEN_AI = fromString("azureOpenAI");

    /** Generate embeddings using a custom web endpoint at query time. */
    public static final VectorSearchVectorizerKind CUSTOM_WEB_API = fromString("customWebApi");

    /**
     * Creates a new instance of VectorSearchVectorizerKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VectorSearchVectorizerKind() {}

    /**
     * Creates or finds a VectorSearchVectorizerKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VectorSearchVectorizerKind.
     */
    public static VectorSearchVectorizerKind fromString(String name) {
        return fromString(name, VectorSearchVectorizerKind.class);
    }

    /**
     * Gets known VectorSearchVectorizerKind values.
     *
     * @return known VectorSearchVectorizerKind values.
     */
    public static Collection<VectorSearchVectorizerKind> values() {
        return values(VectorSearchVectorizerKind.class);
    }
}