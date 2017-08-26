package com.github.akutschera.extension.junit5.p06parameters;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
@ExtendWith(RandomExtension.class)
@Tag("may-fail")
public class RandomExampleTest {

    @Test
    @DisplayName( "test with random boolean parameters from Extension (may fail up to three assertions)" )
    void withRandom( Boolean random1, Boolean random2, Boolean random3 ) {
        assertAll( () -> assertTrue( random1, "failed because 1st random boolean is false" ),
                   () -> assertTrue( random2, "failed because 2nd random boolean is false" ),
                   () -> assertTrue( random3, "failed because 3rd random boolean is false" )
        );
    }

}
