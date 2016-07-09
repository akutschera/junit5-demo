package com.github.akutschera.extension.junit5.p04disabled;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnitPlatform.class )
public class DisabledTest {

    @Test
    void succeed() {
        assertTrue( true );
    }

    @Test
    @Disabled
    void doNotRun() {
        fail( "this test should not be run because it is p04disabled" );
    }
}
