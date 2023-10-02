// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core;

import com.client.core.util.serializer.HttpBinJSON;
import com.client.core.exception.HttpResponseException;
import com.client.core.http.HttpResponse;

public class MyOtherRestException extends HttpResponseException {
    /**
     * Creates a service request exception.
     *
     * @param message Message associated with exception.
     * @param response HttpResponse associated with the exception.
     * @param body Deserialized body of {@code response}.
     */
    public MyOtherRestException(String message, HttpResponse response, HttpBinJSON body) {
        super(message, response, body);
    }

    @Override
    public HttpBinJSON getValue() {
        return (HttpBinJSON) super.getValue();
    }
}