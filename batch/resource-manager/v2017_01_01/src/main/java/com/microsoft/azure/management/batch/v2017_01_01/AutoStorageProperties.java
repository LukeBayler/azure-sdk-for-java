/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_01_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about the auto storage account associated with a Batch
 * account.
 */
public class AutoStorageProperties {
    /**
     * The resource ID of the storage account to be used for auto storage
     * account.
     */
    @JsonProperty(value = "storageAccountId", required = true)
    private String storageAccountId;

    /**
     * The UTC time at which storage keys were last synchronized with the Batch
     * account.
     */
    @JsonProperty(value = "lastKeySync", required = true)
    private DateTime lastKeySync;

    /**
     * Get the resource ID of the storage account to be used for auto storage account.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the resource ID of the storage account to be used for auto storage account.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the AutoStorageProperties object itself.
     */
    public AutoStorageProperties withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

    /**
     * Get the UTC time at which storage keys were last synchronized with the Batch account.
     *
     * @return the lastKeySync value
     */
    public DateTime lastKeySync() {
        return this.lastKeySync;
    }

    /**
     * Set the UTC time at which storage keys were last synchronized with the Batch account.
     *
     * @param lastKeySync the lastKeySync value to set
     * @return the AutoStorageProperties object itself.
     */
    public AutoStorageProperties withLastKeySync(DateTime lastKeySync) {
        this.lastKeySync = lastKeySync;
        return this;
    }

}