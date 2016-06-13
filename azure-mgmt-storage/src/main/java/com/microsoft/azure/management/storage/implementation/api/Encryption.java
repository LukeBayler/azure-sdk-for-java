/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.storage.implementation.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The encryption settings on the account.
 */
public class Encryption {
    /**
     * Gets the services which are encrypted.
     */
    private EncryptionServices services;

    /**
     * Gets the encryption keySource(provider). Possible values
     * (case-insensitive):  Microsoft.Storage.
     */
    @JsonProperty(required = true)
    private String keySource;

    /**
     * Creates an instance of Encryption class.
     */
    public Encryption() {
        keySource = "Microsoft.Storage";
    }

    /**
     * Get the services value.
     *
     * @return the services value
     */
    public EncryptionServices services() {
        return this.services;
    }

    /**
     * Set the services value.
     *
     * @param services the services value to set
     * @return the Encryption object itself.
     */
    public Encryption withServices(EncryptionServices services) {
        this.services = services;
        return this;
    }

    /**
     * Get the keySource value.
     *
     * @return the keySource value
     */
    public String keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource value.
     *
     * @param keySource the keySource value to set
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(String keySource) {
        this.keySource = keySource;
        return this;
    }

}
