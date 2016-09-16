/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import java.util.Map;
import java.util.Set;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.apigeneration.LangDefinition.MethodConversion;
import com.microsoft.azure.management.network.implementation.BackendAddressPoolInner;
import com.microsoft.azure.management.network.model.HasLoadBalancingRules;
import com.microsoft.azure.management.resources.fluentcore.arm.models.ChildResource;
import com.microsoft.azure.management.resources.fluentcore.model.Attachable;
import com.microsoft.azure.management.resources.fluentcore.model.Settable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;

/**
 * An immutable client-side representation of an load balancer's backend address pool.
 */
@LangDefinition()
public interface Backend extends
    Wrapper<BackendAddressPoolInner>,
    ChildResource<LoadBalancer>,
    HasLoadBalancingRules {

    /**
     * @return a map of names of the IP configurations of network interfaces assigned to this backend,
     * indexed by their NIC's resource id
     */
    Map<String, String> backendNicIpConfigurationNames();

    /**
     * @return a list of the resource IDs of the virtual machines associated with this backend
     */
    Set<String> getVirtualMachineIds();

    /**
     * Grouping of backend definition stages.
     */
    @LangDefinition(ContainerName = "Definition", ContainerFileName = "IDefinition", IsContainerOnly = true, MethodConversionType = MethodConversion.OnlyMethod)
    interface DefinitionStages {
        /**
         * The first stage of the backend definition.
         * @param <ParentT> the return type of the final {@link WithAttach#attach()}
         */
        interface Blank<ParentT> extends WithAttach<ParentT> {
        }

        /** The final stage of the backend definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the definition
         * can be attached to the parent load balancer definition using {@link WithAttach#attach()}.
         * @param <ParentT> the return type of {@link WithAttach#attach()}
         */
        interface WithAttach<ParentT> extends
            Attachable.InDefinition<ParentT> {
        }
    }

    /** The entirety of a backend definition.
     * @param <ParentT> the return type of the final {@link DefinitionStages.WithAttach#attach()}
     */
    @LangDefinition()
    interface Definition<ParentT> extends
        DefinitionStages.Blank<ParentT>,
        DefinitionStages.WithAttach<ParentT> {
    }

    /**
     * Grouping of backend update stages.
     */
    @LangDefinition(ContainerName = "Update", ContainerFileName = "IUpdate", IsContainerOnly = true)
    interface UpdateStages {
    }

    /**
     * The entirety of a backend update as part of a load balancer update.
     */
    @LangDefinition(MethodConversionType = MethodConversion.OnlyMethod)
    interface Update extends
        Settable<LoadBalancer.Update> {
    }

    /**
     * Grouping of backend definition stages applicable as part of a load balancer update.
     */
    @LangDefinition(ContainerName = "UpdateDefinition", ContainerFileName = "IUpdateDefinition", IsContainerOnly = true, MethodConversionType = MethodConversion.OnlyMethod)
    interface UpdateDefinitionStages {
        /**
         * The first stage of the backend definition.
         * @param <ParentT> the return type of the final {@link WithAttach#attach()}
         */
        interface Blank<ParentT> extends WithAttach<ParentT> {
        }

        /** The final stage of the backend definition.
         * <p>
         * At this stage, any remaining optional settings can be specified, or the definition
         * can be attached to the parent load balancer definition using {@link WithAttach#attach()}.
         * @param <ParentT> the return type of {@link WithAttach#attach()}
         */
        interface WithAttach<ParentT> extends
            Attachable.InUpdate<ParentT> {
        }
    }

    /** The entirety of a probe definition as part of a load balancer update.
     * @param <ParentT> the return type of the final {@link UpdateDefinitionStages.WithAttach#attach()}
     */
    @LangDefinition()
    interface UpdateDefinition<ParentT> extends
        UpdateDefinitionStages.Blank<ParentT>,
        UpdateDefinitionStages.WithAttach<ParentT> {
    }
}
