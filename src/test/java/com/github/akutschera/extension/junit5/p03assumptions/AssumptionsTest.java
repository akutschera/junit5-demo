package com.github.akutschera.extension.junit5.p03assumptions;

import static org.junit.gen5.api.Assertions.fail;
import static org.junit.gen5.api.Assumptions.assumeTrue;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnit5.class )
public class AssumptionsTest {

    @Test
    @DisplayName( "when assumption is false, the remainder of the test will not be executed" )
    void assumptionFalse() {
        assumeTrue( false );
        fail( "should not be reached" );
    }
}
