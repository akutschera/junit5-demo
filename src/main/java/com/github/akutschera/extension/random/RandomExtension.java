package com.github.akutschera.extension.random;

import java.lang.reflect.Parameter;
import java.util.Optional;
import java.util.Random;

import org.junit.gen5.api.extension.ExtensionContext;
import org.junit.gen5.api.extension.ParameterResolutionException;
import org.junit.gen5.api.extension.ParameterResolver;

/**
 * Created by Andreas Kutschera on 19.04.16.
 */
public class RandomExtension implements ParameterResolver {

    @Override
    public boolean supports( Parameter parameter, Optional<Object> optional, ExtensionContext
            extensionContext ) throws ParameterResolutionException {
        return parameter.getType().equals( Boolean.class );
    }

    @Override
    public Object resolve( Parameter parameter,Optional<Object> optional, ExtensionContext extensionContext ) throws ParameterResolutionException {
        return new Random().nextBoolean();
    }
}
