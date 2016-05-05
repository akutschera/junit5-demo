package com.github.akutschera.extension.junit5.p05nested;

import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */

@RunWith( JUnit5.class )
@DisplayName( "Example for p05nested tests: " )
public class NestedTest {

    @Nested
    @DisplayName( "on the first level" )
    class FirstLevel {

        @DisplayName( "test is run" )
        @Test
        void test1() {
            assertTrue( true );
        }

        @Nested
        @DisplayName( "on the second level" )
        class SecondLevel {

            @DisplayName( "another test is run" )
            @Test
            void test1() {
                assertTrue( true );
            }
        }
    }

}
