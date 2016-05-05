package com.github.akutschera.extension.junit5.p02assertions;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertNotNull;
import static org.junit.gen5.api.Assertions.assertTrue;
import static org.junit.gen5.api.Assertions.expectThrows;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(JUnit5.class)
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
        assertAll( () -> assertTrue( false, "first test" )
                , () -> assertTrue( true, "second test, should pass" )
                , () -> assertTrue( false, "third test" ) );
    }



}
