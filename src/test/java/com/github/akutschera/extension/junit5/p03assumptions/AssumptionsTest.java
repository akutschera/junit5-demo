package com.github.akutschera.extension.junit5.p03assumptions;


import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnitPlatform.class )
public class AssumptionsTest {

    @Test
    @DisplayName( "when assumption is false, the remainder of the test will not be executed" )
    void assumptionFalse() {
        assumeTrue( false );
        fail( "should not be reached" );
    }
}
