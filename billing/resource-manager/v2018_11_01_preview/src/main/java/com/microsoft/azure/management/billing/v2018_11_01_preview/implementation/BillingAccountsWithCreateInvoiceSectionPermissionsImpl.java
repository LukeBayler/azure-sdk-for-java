/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountsWithCreateInvoiceSectionPermissions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountListResult;

class BillingAccountsWithCreateInvoiceSectionPermissionsImpl extends WrapperImpl<BillingAccountsWithCreateInvoiceSectionPermissionsInner> implements BillingAccountsWithCreateInvoiceSectionPermissions {
    private final BillingManager manager;

    BillingAccountsWithCreateInvoiceSectionPermissionsImpl(BillingManager manager) {
        super(manager.inner().billingAccountsWithCreateInvoiceSectionPermissions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<BillingAccountListResult> listAsync() {
        BillingAccountsWithCreateInvoiceSectionPermissionsInner client = this.inner();
        return client.listAsync()
        .map(new Func1<BillingAccountListResultInner, BillingAccountListResult>() {
            @Override
            public BillingAccountListResult call(BillingAccountListResultInner inner) {
                return new BillingAccountListResultImpl(inner, manager());
            }
        });
    }

}
