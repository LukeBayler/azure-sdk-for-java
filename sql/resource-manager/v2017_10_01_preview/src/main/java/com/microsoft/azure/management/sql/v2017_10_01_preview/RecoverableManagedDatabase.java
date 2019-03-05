/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_10_01_preview.implementation.RecoverableManagedDatabaseInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_10_01_preview.implementation.SqlManager;

/**
 * Type representing RecoverableManagedDatabase.
 */
public interface RecoverableManagedDatabase extends HasInner<RecoverableManagedDatabaseInner>, Indexable, Refreshable<RecoverableManagedDatabase>, HasManager<SqlManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the lastAvailableBackupDate value.
     */
    String lastAvailableBackupDate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

}