/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.RestoreResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RestoreResponseImpl extends WrapperImpl<RestoreResponseInner> implements RestoreResponse {
    private final WebManager manager;
    RestoreResponseImpl(RestoreResponseInner inner, WebManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WebManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String operationId() {
        return this.inner().operationId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}