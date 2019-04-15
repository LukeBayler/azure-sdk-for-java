/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details needed to monitor a Hana Instance.
 */
public class MonitoringDetails {
    /**
     * ARM ID of an Azure Vnet with access to the HANA instance.
     */
    @JsonProperty(value = "hanaVnet")
    private String hanaVnet;

    /**
     * Hostname of the HANA Instance blade.
     */
    @JsonProperty(value = "hanaHostname")
    private String hanaHostname;

    /**
     * A number between 00 and 99, stored as a string to maintain leading zero.
     */
    @JsonProperty(value = "hanaInstanceNum")
    private String hanaInstanceNum;

    /**
     * Either single or multiple depending on the use of MDC(Multiple Database
     * Containers). Possible values include: 'single', 'multiple'.
     */
    @JsonProperty(value = "dbContainer")
    private HanaDatabaseContainersEnum dbContainer;

    /**
     * Name of the database itself.  It only needs to be specified if using
     * MDC.
     */
    @JsonProperty(value = "hanaDatabase")
    private String hanaDatabase;

    /**
     * Username for the HANA database to login to for monitoring.
     */
    @JsonProperty(value = "hanaDbUsername")
    private String hanaDbUsername;

    /**
     * Password for the HANA database to login for monitoring.
     */
    @JsonProperty(value = "hanaDbPassword")
    private String hanaDbPassword;

    /**
     * Get aRM ID of an Azure Vnet with access to the HANA instance.
     *
     * @return the hanaVnet value
     */
    public String hanaVnet() {
        return this.hanaVnet;
    }

    /**
     * Set aRM ID of an Azure Vnet with access to the HANA instance.
     *
     * @param hanaVnet the hanaVnet value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaVnet(String hanaVnet) {
        this.hanaVnet = hanaVnet;
        return this;
    }

    /**
     * Get hostname of the HANA Instance blade.
     *
     * @return the hanaHostname value
     */
    public String hanaHostname() {
        return this.hanaHostname;
    }

    /**
     * Set hostname of the HANA Instance blade.
     *
     * @param hanaHostname the hanaHostname value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaHostname(String hanaHostname) {
        this.hanaHostname = hanaHostname;
        return this;
    }

    /**
     * Get a number between 00 and 99, stored as a string to maintain leading zero.
     *
     * @return the hanaInstanceNum value
     */
    public String hanaInstanceNum() {
        return this.hanaInstanceNum;
    }

    /**
     * Set a number between 00 and 99, stored as a string to maintain leading zero.
     *
     * @param hanaInstanceNum the hanaInstanceNum value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaInstanceNum(String hanaInstanceNum) {
        this.hanaInstanceNum = hanaInstanceNum;
        return this;
    }

    /**
     * Get either single or multiple depending on the use of MDC(Multiple Database Containers). Possible values include: 'single', 'multiple'.
     *
     * @return the dbContainer value
     */
    public HanaDatabaseContainersEnum dbContainer() {
        return this.dbContainer;
    }

    /**
     * Set either single or multiple depending on the use of MDC(Multiple Database Containers). Possible values include: 'single', 'multiple'.
     *
     * @param dbContainer the dbContainer value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withDbContainer(HanaDatabaseContainersEnum dbContainer) {
        this.dbContainer = dbContainer;
        return this;
    }

    /**
     * Get name of the database itself.  It only needs to be specified if using MDC.
     *
     * @return the hanaDatabase value
     */
    public String hanaDatabase() {
        return this.hanaDatabase;
    }

    /**
     * Set name of the database itself.  It only needs to be specified if using MDC.
     *
     * @param hanaDatabase the hanaDatabase value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDatabase(String hanaDatabase) {
        this.hanaDatabase = hanaDatabase;
        return this;
    }

    /**
     * Get username for the HANA database to login to for monitoring.
     *
     * @return the hanaDbUsername value
     */
    public String hanaDbUsername() {
        return this.hanaDbUsername;
    }

    /**
     * Set username for the HANA database to login to for monitoring.
     *
     * @param hanaDbUsername the hanaDbUsername value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDbUsername(String hanaDbUsername) {
        this.hanaDbUsername = hanaDbUsername;
        return this;
    }

    /**
     * Get password for the HANA database to login for monitoring.
     *
     * @return the hanaDbPassword value
     */
    public String hanaDbPassword() {
        return this.hanaDbPassword;
    }

    /**
     * Set password for the HANA database to login for monitoring.
     *
     * @param hanaDbPassword the hanaDbPassword value to set
     * @return the MonitoringDetails object itself.
     */
    public MonitoringDetails withHanaDbPassword(String hanaDbPassword) {
        this.hanaDbPassword = hanaDbPassword;
        return this;
    }

}
