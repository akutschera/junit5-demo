package com.github.akutschera.extension.junit5.p05nested;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * Created by Andreas Kutschera.
 */

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
