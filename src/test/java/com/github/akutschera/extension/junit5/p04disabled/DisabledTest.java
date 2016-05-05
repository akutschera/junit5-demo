package com.github.akutschera.extension.junit5.p04disabled;

import static org.junit.gen5.api.Assertions.assertTrue;
import static org.junit.gen5.api.Assertions.fail;

import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnit5.class )
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
