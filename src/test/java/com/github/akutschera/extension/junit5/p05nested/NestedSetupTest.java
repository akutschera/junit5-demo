package com.github.akutschera.extension.junit5.p05nested;


import static org.junit.gen5.api.Assertions.assertEquals;

import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */

@RunWith(JUnit5.class)
@DisplayName("Example for p05nested setup tests: ")
public class NestedSetupTest {

    int value;

    @BeforeEach
    void topLevelSetup() {
        value = 1;
    }

    @Nested
    @DisplayName("on the first level")
    class FirstLevel {

        @BeforeEach
        void firstLevelSetup() {
            value++;
        }

        @AfterEach
        @DisplayName( "whatever happens here has no effect on second level tests" )
        void firstLevelTearDown() { value++; }

        @DisplayName("test is run")
        @Test
        void test1() {
            assertEquals( value, 2, "value should have been increased by first level setup" );
        }

        @Nested
        @DisplayName("on the second level")
        class SecondLevel {

            @BeforeEach
            void beforeSecondLevel() {
                value++;
            }

            @DisplayName("another test is run")
            @Test
            void test1() {
                assertEquals( value, 3, "value should have been increased by second level setup" );
            }
        }
    }

}
