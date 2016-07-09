package com.github.akutschera.extension.junit5.p05nested;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */

@RunWith(JUnitPlatform.class)
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
