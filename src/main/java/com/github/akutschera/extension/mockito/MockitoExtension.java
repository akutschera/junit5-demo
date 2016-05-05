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

import java.lang.reflect.Parameter;

import org.junit.gen5.api.extension.ExtensionContext;
import org.junit.gen5.api.extension.MethodInvocationContext;
import org.junit.gen5.api.extension.MethodParameterResolver;
import org.junit.gen5.api.extension.ParameterResolutionException;
import org.mockito.Mockito;


public class MockitoExtension implements MethodParameterResolver {

    @Override
    public boolean supports( Parameter parameter, MethodInvocationContext methodInvocationContext, ExtensionContext
            extensionContext ) throws ParameterResolutionException {
        return parameter.isAnnotationPresent( InjectMock.class );
    }

    @Override
    public Object resolve( Parameter parameter, MethodInvocationContext methodInvocationContext, ExtensionContext
            extensionContext ) throws ParameterResolutionException {
        return Mockito.mock( parameter.getType() );
    }


}
