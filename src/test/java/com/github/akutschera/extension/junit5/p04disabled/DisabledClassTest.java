package com.github.akutschera.extension.junit5.p04disabled;

import static org.junit.gen5.api.Assertions.fail;

import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnit5.class )
@Disabled
public class DisabledClassTest {

    @Test
    void failUnlessDisabled() {
        fail( "this should not be executed when the whole class is p04disabled" );
    }

}
