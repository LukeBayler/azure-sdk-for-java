/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.CertificateDescriptionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IoTHubManager;

/**
 * Type representing CertificateDescription.
 */
public interface CertificateDescription extends HasInner<CertificateDescriptionInner>, Indexable, Refreshable<CertificateDescription>, Updatable<CertificateDescription.Update>, HasManager<IoTHubManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    CertificateProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CertificateDescription definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithIotHub, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CertificateDescription definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CertificateDescription definition.
         */
        interface Blank extends WithIotHub {
        }

        /**
         * The stage of the certificatedescription definition allowing to specify IotHub.
         */
        interface WithIotHub {
           /**
            * Specifies resourceGroupName, resourceName.
            */
            WithCreate withExistingIotHub(String resourceGroupName, String resourceName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CertificateDescription> {
        }
    }
    /**
     * The template for a CertificateDescription update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CertificateDescription> {
    }

    /**
     * Grouping of CertificateDescription update stages.
     */
    interface UpdateStages {
    }
}
