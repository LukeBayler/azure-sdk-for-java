/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.Period;

/**
 * Specifies the execution constraints for jobs created on a schedule.
 */
public class JobConstraints {
    /**
     * Gets or sets the maximum elapsed time that the job may run, measured
     * from the time the job starts. If the job does not complete within the
     * time limit, the Batch service terminates it and any tasks that are
     * still running.
     */
    private Period maxWallClockTime;

    /**
     * Gets or sets the maximum number of times each task may be retried. The
     * Batch service retries a task if its exit code is nonzero.
     */
    private Integer maxTaskRetryCount;

    /**
     * Get the maxWallClockTime value.
     *
     * @return the maxWallClockTime value
     */
    public Period getMaxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime value.
     *
     * @param maxWallClockTime the maxWallClockTime value to set
     */
    public void setMaxWallClockTime(Period maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
    }

    /**
     * Get the maxTaskRetryCount value.
     *
     * @return the maxTaskRetryCount value
     */
    public Integer getMaxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set the maxTaskRetryCount value.
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set
     */
    public void setMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
    }

}