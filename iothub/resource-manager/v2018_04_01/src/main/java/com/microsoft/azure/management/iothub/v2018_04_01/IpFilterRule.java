/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP filter rules for the IoT hub.
 */
public class IpFilterRule {
    /**
     * The name of the IP filter rule.
     */
    @JsonProperty(value = "filterName", required = true)
    private String filterName;

    /**
     * The desired action for requests captured by this rule. Possible values
     * include: 'Accept', 'Reject'.
     */
    @JsonProperty(value = "action", required = true)
    private IpFilterActionType action;

    /**
     * A string that contains the IP address range in CIDR notation for the
     * rule.
     */
    @JsonProperty(value = "ipMask", required = true)
    private String ipMask;

    /**
     * Get the filterName value.
     *
     * @return the filterName value
     */
    public String filterName() {
        return this.filterName;
    }

    /**
     * Set the filterName value.
     *
     * @param filterName the filterName value to set
     * @return the IpFilterRule object itself.
     */
    public IpFilterRule withFilterName(String filterName) {
        this.filterName = filterName;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public IpFilterActionType action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the IpFilterRule object itself.
     */
    public IpFilterRule withAction(IpFilterActionType action) {
        this.action = action;
        return this;
    }

    /**
     * Get the ipMask value.
     *
     * @return the ipMask value
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set the ipMask value.
     *
     * @param ipMask the ipMask value to set
     * @return the IpFilterRule object itself.
     */
    public IpFilterRule withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

}
