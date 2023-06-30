// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.selfhelp.fluent.models.SolutionResourceInner;

/** An immutable client-side representation of SolutionResource. */
public interface SolutionResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Solution result.
     *
     * @return the properties value.
     */
    SolutionResourceProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.selfhelp.fluent.models.SolutionResourceInner object.
     *
     * @return the inner object.
     */
    SolutionResourceInner innerModel();

    /** The entirety of the SolutionResource definition. */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithScope, DefinitionStages.WithCreate {
    }

    /** The SolutionResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the SolutionResource definition. */
        interface Blank extends WithScope {
        }

        /** The stage of the SolutionResource definition allowing to specify parent resource. */
        interface WithScope {
            /**
             * Specifies scope.
             *
             * @param scope This is an extension resource provider and only resource level extension is supported at the
             *     moment.
             * @return the next definition stage.
             */
            WithCreate withExistingScope(String scope);
        }

        /**
         * The stage of the SolutionResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SolutionResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SolutionResource create(Context context);
        }

        /** The stage of the SolutionResource definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Solution result.
             *
             * @param properties Solution result.
             * @return the next definition stage.
             */
            WithCreate withProperties(SolutionResourceProperties properties);
        }
    }

    /**
     * Begins update for the SolutionResource resource.
     *
     * @return the stage of resource update.
     */
    SolutionResource.Update update();

    /** The template for SolutionResource update. */
    interface Update extends UpdateStages.WithProperties {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SolutionResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SolutionResource apply(Context context);
    }

    /** The SolutionResource update stages. */
    interface UpdateStages {
        /** The stage of the SolutionResource update allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Solution result.
             *
             * @param properties Solution result.
             * @return the next definition stage.
             */
            Update withProperties(SolutionResourceProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SolutionResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SolutionResource refresh(Context context);
}