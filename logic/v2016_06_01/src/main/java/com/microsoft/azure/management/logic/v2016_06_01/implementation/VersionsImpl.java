/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2016_06_01.Versions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2016_06_01.WorkflowVersion;
import com.microsoft.azure.management.logic.v2016_06_01.VersionWorkflowTriggers;

class VersionsImpl extends WrapperImpl<WorkflowVersionsInner> implements Versions {
    private final LogicManager manager;

    VersionsImpl(LogicManager manager) {
        super(manager.inner().workflowVersions());
        this.manager = manager;
    }

    @Override
    public VersionWorkflowTriggers triggers() {
        VersionWorkflowTriggers accessor = this.manager().versionWorkflowTriggers();
        return accessor;
    }

    public LogicManager manager() {
        return this.manager;
    }

    private WorkflowVersionImpl wrapModel(WorkflowVersionInner inner) {
        return  new WorkflowVersionImpl(inner, manager());
    }

    private Observable<Page<WorkflowVersionInner>> listByWorkflowNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        WorkflowVersionsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<WorkflowVersionInner>, Observable<Page<WorkflowVersionInner>>>() {
            @Override
            public Observable<Page<WorkflowVersionInner>> call(Page<WorkflowVersionInner> page) {
                return Observable.just(page).concatWith(listByWorkflowNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<WorkflowVersion> listByWorkflowAsync(final String resourceGroupName, final String workflowName) {
        WorkflowVersionsInner client = this.inner();
        return client.listAsync(resourceGroupName, workflowName)
        .flatMap(new Func1<Page<WorkflowVersionInner>, Observable<Page<WorkflowVersionInner>>>() {
            @Override
            public Observable<Page<WorkflowVersionInner>> call(Page<WorkflowVersionInner> page) {
                return listByWorkflowNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<WorkflowVersionInner>, Iterable<WorkflowVersionInner>>() {
            @Override
            public Iterable<WorkflowVersionInner> call(Page<WorkflowVersionInner> page) {
                return page.items();
            }
       })
        .map(new Func1<WorkflowVersionInner, WorkflowVersion>() {
            @Override
            public WorkflowVersion call(WorkflowVersionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<WorkflowVersion> getByWorkflowAsync(String resourceGroupName, String workflowName, String versionId) {
        WorkflowVersionsInner client = this.inner();
        return client.getAsync(resourceGroupName, workflowName, versionId)
        .map(new Func1<WorkflowVersionInner, WorkflowVersion>() {
            @Override
            public WorkflowVersion call(WorkflowVersionInner inner) {
                return wrapModel(inner);
            }
       });
    }

}