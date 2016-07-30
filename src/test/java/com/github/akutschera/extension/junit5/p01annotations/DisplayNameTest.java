package com.github.akutschera.extension.junit5.p01annotations;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by Andreas Kutschera.
 */
@DisplayName("tests for @DisplayName annotation")
public class DisplayNameTest {

    @Test
    @DisplayName("include even unicode chars in test name \uD83D\uDE31")
    public void someTest() throws Exception {
        assertTrue( true );
    }

    @Test
    @Disabled
    @DisplayName("even ignored tests are displayed by name")
    public void ignoreMePlease() {
        fail( "should have been skipped" );
    }

    @Test
    @DisplayName("two tests could have the same display name")
    void test1() {
        assertTrue( true );
    }

    @Test
    @DisplayName("two tests could have the same display name")
    void testWithSomeVeryLongNameInCamelCaseThatMakesItHardToReadAndUnderstand() {
        assertTrue( true );
    }
}
