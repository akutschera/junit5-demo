package com.github.akutschera.extension.junit5.p09exceptions;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.exception.MalformedUrlExceptionHandler;

/**
 * Created by Andreas Kutschera.
 */
@ExtendWith(MalformedUrlExceptionHandler.class)
public class SwallowExceptionTest {

    @DisplayName( "this test makes no sense when url is malformed" )
    @Test
    void doNotFailWhenServiceIsUnreachable() throws MalformedURLException {
        new URL( "should throw exception");
    }

}
