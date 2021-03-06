/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.UUID;

/**
 * The CreateProjectOptionalParameter model.
 */
public class CreateProjectOptionalParameter {
    /**
     * The description of the project.
     */
    private String description;

    /**
     * The id of the domain to use for this project. Defaults to General.
     */
    private UUID domainId;

    /**
     * The type of classifier to create for this project. Possible values
     * include: 'Multiclass', 'Multilabel'.
     */
    private String classificationType;

    /**
     * Gets or sets the preferred language for the response.
     */
    private String thisclientacceptLanguage;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the CreateProjectOptionalParameter object itself.
     */
    public CreateProjectOptionalParameter withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the domainId value.
     *
     * @return the domainId value
     */
    public UUID domainId() {
        return this.domainId;
    }

    /**
     * Set the domainId value.
     *
     * @param domainId the domainId value to set
     * @return the CreateProjectOptionalParameter object itself.
     */
    public CreateProjectOptionalParameter withDomainId(UUID domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get the classificationType value.
     *
     * @return the classificationType value
     */
    public String classificationType() {
        return this.classificationType;
    }

    /**
     * Set the classificationType value.
     *
     * @param classificationType the classificationType value to set
     * @return the CreateProjectOptionalParameter object itself.
     */
    public CreateProjectOptionalParameter withClassificationType(String classificationType) {
        this.classificationType = classificationType;
        return this;
    }

    /**
     * Get the thisclientacceptLanguage value.
     *
     * @return the thisclientacceptLanguage value
     */
    public String thisclientacceptLanguage() {
        return this.thisclientacceptLanguage;
    }

    /**
     * Set the thisclientacceptLanguage value.
     *
     * @param thisclientacceptLanguage the thisclientacceptLanguage value to set
     * @return the CreateProjectOptionalParameter object itself.
     */
    public CreateProjectOptionalParameter withThisclientacceptLanguage(String thisclientacceptLanguage) {
        this.thisclientacceptLanguage = thisclientacceptLanguage;
        return this;
    }

}
