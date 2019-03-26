/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.InvoiceSectionsBillingPermissionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing InvoiceSectionsBillingPermissions.
 */
public interface InvoiceSectionsBillingPermissions extends HasInner<InvoiceSectionsBillingPermissionsInner> {
    /**
     * Lists all billingPermissions for the caller has for a Invoice Section.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<BillingPermissionsListResult> listAsync(String billingAccountName, String invoiceSectionName);

}
