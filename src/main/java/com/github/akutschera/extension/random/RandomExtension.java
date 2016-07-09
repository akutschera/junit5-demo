package com.github.akutschera.extension.random;

import java.util.Random;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;


/**
 * Created by Andreas Kutschera.
 */
public class RandomExtension implements ParameterResolver {

    @Override
    public boolean supports( ParameterContext parameterContext, ExtensionContext extensionContext ) throws
            ParameterResolutionException {
        return parameterContext.getParameter().getType().equals( Boolean.class );
    }

    @Override
    public Object resolve( ParameterContext parameterContext, ExtensionContext extensionContext ) throws
            ParameterResolutionException {
        return new Random().nextBoolean();
    }
}
