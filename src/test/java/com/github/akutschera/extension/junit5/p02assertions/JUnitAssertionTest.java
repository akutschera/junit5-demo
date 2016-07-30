package com.github.akutschera.extension.junit5.p02assertions;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Andreas Kutschera.
 */
public class JUnitAssertionTest {

    @Test
    @DisplayName( "some simple assertions" )
    void basicAssertions() {
        assertEquals( 2, ( 1 + 1 ) );
        assertTrue( true, "error messages are now at the end" );
        assertNotNull( new Object() );
    }

    @Test
    @DisplayName("show that error messages can be evaluated lazily")
    void lazyEvaluation() {
        assertTrue( true, () -> "this would fail if evaluated " + ( 2 / 0 ) );
    }

    @Test
    @DisplayName("no more ErrorCollector rule needed")
    void assertAllTest() {
        assertAll( () -> assertTrue( false, "first test (should fail)" )
                , () -> assertTrue( true, "second test, should pass" )
                , () -> assertTrue( false, "third test (should fail)" ) );
    }



}
