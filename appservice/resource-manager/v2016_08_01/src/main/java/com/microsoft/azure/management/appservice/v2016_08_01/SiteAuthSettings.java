/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.WebManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.SiteAuthSettingsInner;
import java.util.List;

/**
 * Type representing SiteAuthSettings.
 */
public interface SiteAuthSettings extends HasInner<SiteAuthSettingsInner>, HasManager<WebManager> {
    /**
     * @return the additionalLoginParams value.
     */
    List<String> additionalLoginParams();

    /**
     * @return the allowedAudiences value.
     */
    List<String> allowedAudiences();

    /**
     * @return the allowedExternalRedirectUrls value.
     */
    List<String> allowedExternalRedirectUrls();

    /**
     * @return the clientId value.
     */
    String clientId();

    /**
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * @return the defaultProvider value.
     */
    BuiltInAuthenticationProvider defaultProvider();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the facebookAppId value.
     */
    String facebookAppId();

    /**
     * @return the facebookAppSecret value.
     */
    String facebookAppSecret();

    /**
     * @return the facebookOAuthScopes value.
     */
    List<String> facebookOAuthScopes();

    /**
     * @return the googleClientId value.
     */
    String googleClientId();

    /**
     * @return the googleClientSecret value.
     */
    String googleClientSecret();

    /**
     * @return the googleOAuthScopes value.
     */
    List<String> googleOAuthScopes();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the issuer value.
     */
    String issuer();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the microsoftAccountClientId value.
     */
    String microsoftAccountClientId();

    /**
     * @return the microsoftAccountClientSecret value.
     */
    String microsoftAccountClientSecret();

    /**
     * @return the microsoftAccountOAuthScopes value.
     */
    List<String> microsoftAccountOAuthScopes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the runtimeVersion value.
     */
    String runtimeVersion();

    /**
     * @return the tokenRefreshExtensionHours value.
     */
    Double tokenRefreshExtensionHours();

    /**
     * @return the tokenStoreEnabled value.
     */
    Boolean tokenStoreEnabled();

    /**
     * @return the twitterConsumerKey value.
     */
    String twitterConsumerKey();

    /**
     * @return the twitterConsumerSecret value.
     */
    String twitterConsumerSecret();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the unauthenticatedClientAction value.
     */
    UnauthenticatedClientAction unauthenticatedClientAction();

}