/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Restore files/folders from a backup copy of IaaS VM.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("IaasVMILRRegistrationRequest")
public class IaasVMILRRegistrationRequest extends ILRRequest {
    /**
     * ID of the IaaS VM backup copy from where the files/folders have to be
     * restored.
     */
    @JsonProperty(value = "recoveryPointId")
    private String recoveryPointId;

    /**
     * Fully qualified ARM ID of the virtual machine whose the files / folders
     * have to be restored.
     */
    @JsonProperty(value = "virtualMachineId")
    private String virtualMachineId;

    /**
     * iSCSI initiator name.
     */
    @JsonProperty(value = "initiatorName")
    private String initiatorName;

    /**
     * Whether to renew existing registration with the iSCSI server.
     */
    @JsonProperty(value = "renewExistingRegistration")
    private Boolean renewExistingRegistration;

    /**
     * Get iD of the IaaS VM backup copy from where the files/folders have to be restored.
     *
     * @return the recoveryPointId value
     */
    public String recoveryPointId() {
        return this.recoveryPointId;
    }

    /**
     * Set iD of the IaaS VM backup copy from where the files/folders have to be restored.
     *
     * @param recoveryPointId the recoveryPointId value to set
     * @return the IaasVMILRRegistrationRequest object itself.
     */
    public IaasVMILRRegistrationRequest withRecoveryPointId(String recoveryPointId) {
        this.recoveryPointId = recoveryPointId;
        return this;
    }

    /**
     * Get fully qualified ARM ID of the virtual machine whose the files / folders have to be restored.
     *
     * @return the virtualMachineId value
     */
    public String virtualMachineId() {
        return this.virtualMachineId;
    }

    /**
     * Set fully qualified ARM ID of the virtual machine whose the files / folders have to be restored.
     *
     * @param virtualMachineId the virtualMachineId value to set
     * @return the IaasVMILRRegistrationRequest object itself.
     */
    public IaasVMILRRegistrationRequest withVirtualMachineId(String virtualMachineId) {
        this.virtualMachineId = virtualMachineId;
        return this;
    }

    /**
     * Get iSCSI initiator name.
     *
     * @return the initiatorName value
     */
    public String initiatorName() {
        return this.initiatorName;
    }

    /**
     * Set iSCSI initiator name.
     *
     * @param initiatorName the initiatorName value to set
     * @return the IaasVMILRRegistrationRequest object itself.
     */
    public IaasVMILRRegistrationRequest withInitiatorName(String initiatorName) {
        this.initiatorName = initiatorName;
        return this;
    }

    /**
     * Get whether to renew existing registration with the iSCSI server.
     *
     * @return the renewExistingRegistration value
     */
    public Boolean renewExistingRegistration() {
        return this.renewExistingRegistration;
    }

    /**
     * Set whether to renew existing registration with the iSCSI server.
     *
     * @param renewExistingRegistration the renewExistingRegistration value to set
     * @return the IaasVMILRRegistrationRequest object itself.
     */
    public IaasVMILRRegistrationRequest withRenewExistingRegistration(Boolean renewExistingRegistration) {
        this.renewExistingRegistration = renewExistingRegistration;
        return this;
    }

}
