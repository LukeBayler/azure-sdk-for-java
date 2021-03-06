/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.AzureIaaSVMProtectedItem;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.AzureSqlProtectedItem;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.BackupManagementType;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.DataSourceType;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.MabFileFolderProtectedItem;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The base class for backup items.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectedItemType")
@JsonTypeName("ProtectedItem")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureIaaSVMProtectedItem", value = AzureIaaSVMProtectedItem.class),
    @JsonSubTypes.Type(name = "MabFileFolderProtectedItem", value = MabFileFolderProtectedItem.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers/databases", value = AzureSqlProtectedItem.class)
})
public class ProtectedItemInner {
    /**
     * The backup managemenent type associated with the backup item. Possible
     * values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM',
     * 'AzureBackupServer', 'AzureSql'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * The workload type for this item. Possible values include: 'Invalid',
     * 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint',
     * 'DPMUnknown'.
     */
    @JsonProperty(value = "workloadType")
    private DataSourceType workloadType;

    /**
     * The ID of the resource to be backed up.
     */
    @JsonProperty(value = "sourceResourceId")
    private String sourceResourceId;

    /**
     * The ID of the backup policy associated with this backup item.
     */
    @JsonProperty(value = "policyId")
    private String policyId;

    /**
     * The timestamp when the most recent backup copy was created for this
     * backup item.
     */
    @JsonProperty(value = "lastRecoveryPoint")
    private DateTime lastRecoveryPoint;

    /**
     * Get the backup managemenent type associated with the backup item. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set the backup managemenent type associated with the backup item. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the ProtectedItemInner object itself.
     */
    public ProtectedItemInner withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get the workload type for this item. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'DPMUnknown'.
     *
     * @return the workloadType value
     */
    public DataSourceType workloadType() {
        return this.workloadType;
    }

    /**
     * Set the workload type for this item. Possible values include: 'Invalid', 'VM', 'FileFolder', 'AzureSqlDb', 'SQLDB', 'Exchange', 'Sharepoint', 'DPMUnknown'.
     *
     * @param workloadType the workloadType value to set
     * @return the ProtectedItemInner object itself.
     */
    public ProtectedItemInner withWorkloadType(DataSourceType workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * Get the ID of the resource to be backed up.
     *
     * @return the sourceResourceId value
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the ID of the resource to be backed up.
     *
     * @param sourceResourceId the sourceResourceId value to set
     * @return the ProtectedItemInner object itself.
     */
    public ProtectedItemInner withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the ID of the backup policy associated with this backup item.
     *
     * @return the policyId value
     */
    public String policyId() {
        return this.policyId;
    }

    /**
     * Set the ID of the backup policy associated with this backup item.
     *
     * @param policyId the policyId value to set
     * @return the ProtectedItemInner object itself.
     */
    public ProtectedItemInner withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get the timestamp when the most recent backup copy was created for this backup item.
     *
     * @return the lastRecoveryPoint value
     */
    public DateTime lastRecoveryPoint() {
        return this.lastRecoveryPoint;
    }

    /**
     * Set the timestamp when the most recent backup copy was created for this backup item.
     *
     * @param lastRecoveryPoint the lastRecoveryPoint value to set
     * @return the ProtectedItemInner object itself.
     */
    public ProtectedItemInner withLastRecoveryPoint(DateTime lastRecoveryPoint) {
        this.lastRecoveryPoint = lastRecoveryPoint;
        return this;
    }

}
