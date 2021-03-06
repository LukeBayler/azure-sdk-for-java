/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.ServerCommunicationLinkInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2014_04_01.implementation.SqlManager;

/**
 * Type representing ServerCommunicationLink.
 */
public interface ServerCommunicationLink extends HasInner<ServerCommunicationLinkInner>, Indexable, Refreshable<ServerCommunicationLink>, Updatable<ServerCommunicationLink.Update>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the partnerServer value.
     */
    String partnerServer();

    /**
     * @return the state value.
     */
    String state();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ServerCommunicationLink definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithServer, DefinitionStages.WithPartnerServer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ServerCommunicationLink definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ServerCommunicationLink definition.
         */
        interface Blank extends WithServer {
        }

        /**
         * The stage of the servercommunicationlink definition allowing to specify Server.
         */
        interface WithServer {
           /**
            * Specifies resourceGroupName, serverName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @return the next definition stage
            */
            WithPartnerServer withExistingServer(String resourceGroupName, String serverName);
        }

        /**
         * The stage of the servercommunicationlink definition allowing to specify PartnerServer.
         */
        interface WithPartnerServer {
           /**
            * Specifies partnerServer.
            * @param partnerServer The name of the partner server
            * @return the next definition stage
            */
            WithCreate withPartnerServer(String partnerServer);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ServerCommunicationLink> {
        }
    }
    /**
     * The template for a ServerCommunicationLink update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ServerCommunicationLink>, UpdateStages.WithPartnerServer {
    }

    /**
     * Grouping of ServerCommunicationLink update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the servercommunicationlink update allowing to specify PartnerServer.
         */
        interface WithPartnerServer {
            /**
             * Specifies partnerServer.
             * @param partnerServer The name of the partner server
             * @return the next update stage
             */
            Update withPartnerServer(String partnerServer);
        }

    }
}
