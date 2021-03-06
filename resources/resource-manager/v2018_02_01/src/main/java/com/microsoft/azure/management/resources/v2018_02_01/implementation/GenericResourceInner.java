/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01.implementation;

import com.microsoft.azure.management.resources.v2018_02_01.Plan;
import com.microsoft.azure.management.resources.v2018_02_01.Sku;
import com.microsoft.azure.management.resources.v2018_02_01.Identity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Resource information.
 */
@SkipParentValidation
public class GenericResourceInner extends Resource {
    /**
     * The plan of the resource.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /**
     * The resource properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * The kind of the resource.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * ID of the resource that manages this resource.
     */
    @JsonProperty(value = "managedBy")
    private String managedBy;

    /**
     * The SKU of the resource.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Get the plan of the resource.
     *
     * @return the plan value
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan of the resource.
     *
     * @param plan the plan value to set
     * @return the GenericResourceInner object itself.
     */
    public GenericResourceInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the resource properties.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the resource properties.
     *
     * @param properties the properties value to set
     * @return the GenericResourceInner object itself.
     */
    public GenericResourceInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the kind of the resource.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind of the resource.
     *
     * @param kind the kind value to set
     * @return the GenericResourceInner object itself.
     */
    public GenericResourceInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get iD of the resource that manages this resource.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Set iD of the resource that manages this resource.
     *
     * @param managedBy the managedBy value to set
     * @return the GenericResourceInner object itself.
     */
    public GenericResourceInner withManagedBy(String managedBy) {
        this.managedBy = managedBy;
        return this;
    }

    /**
     * Get the SKU of the resource.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of the resource.
     *
     * @param sku the sku value to set
     * @return the GenericResourceInner object itself.
     */
    public GenericResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity of the resource.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity of the resource.
     *
     * @param identity the identity value to set
     * @return the GenericResourceInner object itself.
     */
    public GenericResourceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

}
