/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_01_21;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.kusto.v2019_01_21.implementation.DataConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DataConnections.
 */
public interface DataConnections extends SupportsCreating<DataConnection.DefinitionStages.Blank>, HasInner<DataConnectionsInner> {
    /**
     * Returns a data connection.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataConnection> getAsync(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Returns the list of data connections of the given Kusto database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataConnection> listByDatabaseAsync(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Deletes the data connection with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param dataConnectionName The name of the data connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String clusterName, String databaseName, String dataConnectionName);

    /**
     * Checks that the data connection parameters are valid.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The data connection parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataConnectionValidationListResult> dataConnectionValidationMethodAsync(String resourceGroupName, String clusterName, String databaseName, DataConnectionValidation parameters);

    /**
     * Checks that the data connection name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param name Data Connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String resourceGroupName, String clusterName, String databaseName, String name);

}
