/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v3_2014_04;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v3_2014_04.implementation.RecommendedElasticPoolInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v3_2014_04.implementation.SqlManager;
import java.util.List;
import com.microsoft.azure.Resource;
import org.joda.time.DateTime;

/**
 * Type representing RecommendedElasticPool.
 */
public interface RecommendedElasticPool extends HasInner<RecommendedElasticPoolInner>, Indexable, Refreshable<RecommendedElasticPool>, HasManager<SqlManager> {
    /**
     * @return the databaseDtuMax value.
     */
    Double databaseDtuMax();

    /**
     * @return the databaseDtuMin value.
     */
    Double databaseDtuMin();

    /**
     * @return the databaseEdition value.
     */
    ElasticPoolEdition databaseEdition();

    /**
     * @return the databases value.
     */
    List<TrackedResource> databases();

    /**
     * @return the dtu value.
     */
    Double dtu();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the maxObservedDtu value.
     */
    Double maxObservedDtu();

    /**
     * @return the maxObservedStorageMB value.
     */
    Double maxObservedStorageMB();

    /**
     * @return the metrics value.
     */
    List<RecommendedElasticPoolMetric> metrics();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the observationPeriodEnd value.
     */
    DateTime observationPeriodEnd();

    /**
     * @return the observationPeriodStart value.
     */
    DateTime observationPeriodStart();

    /**
     * @return the storageMB value.
     */
    Double storageMB();

    /**
     * @return the type value.
     */
    String type();

}