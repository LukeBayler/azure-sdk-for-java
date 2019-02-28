/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * This activity suspends pipeline execution for the specified interval.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Wait")
@JsonFlatten
public class WaitActivity extends ControlActivity {
    /**
     * Duration in seconds.
     */
    @JsonProperty(value = "typeProperties.waitTimeInSeconds", required = true)
    private int waitTimeInSeconds;

    /**
     * Get duration in seconds.
     *
     * @return the waitTimeInSeconds value
     */
    public int waitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    /**
     * Set duration in seconds.
     *
     * @param waitTimeInSeconds the waitTimeInSeconds value to set
     * @return the WaitActivity object itself.
     */
    public WaitActivity withWaitTimeInSeconds(int waitTimeInSeconds) {
        this.waitTimeInSeconds = waitTimeInSeconds;
        return this;
    }

}