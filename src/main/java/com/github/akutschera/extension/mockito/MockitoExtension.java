/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package com.github.akutschera.extension.mockito;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.mockito.Mockito;


public class MockitoExtension implements ParameterResolver {

    @Override
    public boolean supportsParameter( ParameterContext parameterContext, ExtensionContext extensionContext ) throws ParameterResolutionException {
        return parameterContext.getParameter().isAnnotationPresent( InjectMock.class );
    }

    @Override
    public Object resolveParameter( ParameterContext parameterContext, ExtensionContext extensionContext ) throws ParameterResolutionException {
        return Mockito.mock( parameterContext.getParameter().getType() );
    }
}
