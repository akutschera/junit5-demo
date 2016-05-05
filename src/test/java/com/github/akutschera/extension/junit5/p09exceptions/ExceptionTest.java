package com.github.akutschera.extension.junit5.p09exceptions;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertThrows;
import static org.junit.gen5.api.Assertions.expectThrows;

import java.util.ArrayList;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(JUnit5.class)
public class ExceptionTest {

    @Test
    @DisplayName( "catch an exception and assert something it should contain or be" )
    void exceptionTesting() {
        IndexOutOfBoundsException exception = expectThrows( IndexOutOfBoundsException.class, () -> {
           throwException();
        } );
        assertEquals( "Index: 1, Size: 0", exception.getMessage() );
    }

    @Test
    @DisplayName( "when we just want to make sure we throw an exception, use assertThrows" )
    void justCatchIt() {
        assertThrows( RuntimeException.class, () -> {
            throwException();
        } );
    }

    private void throwException() {
        new ArrayList<>().get( 1 );
    }
}
