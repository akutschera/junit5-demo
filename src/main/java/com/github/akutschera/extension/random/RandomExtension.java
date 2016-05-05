package com.github.akutschera.extension.random;

import java.lang.reflect.Parameter;
import java.util.Random;

import org.junit.gen5.api.extension.ExtensionContext;
import org.junit.gen5.api.extension.MethodInvocationContext;
import org.junit.gen5.api.extension.MethodParameterResolver;
import org.junit.gen5.api.extension.ParameterResolutionException;

/**
 * Created by Andreas Kutschera on 19.04.16.
 */
public class RandomExtension implements MethodParameterResolver {

    @Override
    public boolean supports( Parameter parameter, MethodInvocationContext methodInvocationContext, ExtensionContext
            extensionContext ) throws ParameterResolutionException {
        return parameter.getType().equals( Boolean.class );
    }

    @Override
    public Object resolve( Parameter parameter, MethodInvocationContext methodInvocationContext, ExtensionContext extensionContext ) throws ParameterResolutionException {
        return new Random().nextBoolean();
    }
}
