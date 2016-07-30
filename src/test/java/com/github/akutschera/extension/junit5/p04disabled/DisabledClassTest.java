package com.github.akutschera.extension.junit5.p04disabled;


import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Created by Andreas Kutschera.
 */
@Disabled
public class DisabledClassTest {

    @Test
    void failUnlessDisabled() {
        fail( "this should not be executed when the whole class is p04disabled" );
    }

}
