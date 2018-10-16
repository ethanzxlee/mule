/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.runtime.module.extension.internal.loader.enricher;


import static org.mule.runtime.module.extension.internal.util.MuleExtensionUtils.addInterceptorFactory;

import org.mule.runtime.api.meta.model.declaration.fluent.ConfigurationDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.ConnectedDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.ConnectionProviderDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.ConstructDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.OperationDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.ParameterDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.ParameterGroupDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.ParameterizedDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.SourceDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.WithConstructsDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.WithOperationsDeclaration;
import org.mule.runtime.api.meta.model.declaration.fluent.WithSourcesDeclaration;
import org.mule.runtime.extension.api.declaration.fluent.util.IdempotentDeclarationWalker;
import org.mule.runtime.extension.api.loader.DeclarationEnricherPhase;
import org.mule.runtime.extension.api.loader.ExtensionLoadingContext;
import org.mule.runtime.module.extension.internal.runtime.connectivity.ConnectionInterceptor;
import org.mule.runtime.module.extension.internal.runtime.streaming.CursorResetInterceptor;

/**
 * ADD JAVA DOC
 *
 * @since 4.2.0
 */
public class DeprecatedModelDeclarationEnricher extends AbstractAnnotatedDeclarationEnricher {

  @Override
  public DeclarationEnricherPhase getExecutionPhase() {
    return DeclarationEnricherPhase.POST_STRUCTURE;
  }

  @Override
  public void enrich(ExtensionLoadingContext extensionLoadingContext) {

    extensionLoadingContext.getExtensionDeclarer().getDeclaration();

    new IdempotentDeclarationWalker() {

      @Override
      protected void onSource(WithSourcesDeclaration owner, SourceDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onConnectionProvider(ConnectionProviderDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onSource(SourceDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onParameterGroup(ParameterGroupDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onParameter(ParameterGroupDeclaration parameterGroup, ParameterDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onConstruct(ConstructDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onConfiguration(ConfigurationDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

      @Override
      protected void onOperation(OperationDeclaration declaration) {
          // ADD IMPLEMENTATION
      }

    }.walk(extensionLoadingContext.getExtensionDeclarer().getDeclaration());
  }
}
