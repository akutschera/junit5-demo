package com.github.akutschera.extension.junit5.p09exceptions;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Andreas Kutschera.
 */
public class ExceptionTest {

    @Test
    @DisplayName( "catch an exception and assert something it should contain or be" )
    void exceptionTesting() {
        IndexOutOfBoundsException exception = assertThrows( IndexOutOfBoundsException.class, this::throwException );
        assertEquals( "Index: 1, Size: 0", exception.getMessage() );
    }

    @Test
    @DisplayName( "when we just want to make sure we throw an exception, use assertThrows" )
    void justCatchIt() {
        assertThrows( RuntimeException.class, this::throwException );
    }

    private void throwException() {
        new ArrayList<>().get( 1 );
    }
}
