/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A recoverable managed database resource.
 */
@JsonFlatten
public class RecoverableManagedDatabaseInner extends ProxyResource {
    /**
     * The last available backup date.
     */
    @JsonProperty(value = "properties.lastAvailableBackupDate", access = JsonProperty.Access.WRITE_ONLY)
    private String lastAvailableBackupDate;

    /**
     * Get the last available backup date.
     *
     * @return the lastAvailableBackupDate value
     */
    public String lastAvailableBackupDate() {
        return this.lastAvailableBackupDate;
    }

}