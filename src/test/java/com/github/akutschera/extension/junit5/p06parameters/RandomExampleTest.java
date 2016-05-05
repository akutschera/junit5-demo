package com.github.akutschera.extension.junit5.p06parameters;

import static org.junit.gen5.api.Assertions.assertAll;
import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(JUnit5.class)
@ExtendWith(RandomExtension.class)
public class RandomExampleTest {

    @Test
    @DisplayName( "test with random boolean parameters from Extension" )
    void withRandom( Boolean random1, Boolean random2, Boolean random3 ) {
        assertAll( () -> assertTrue( random1, "1st random boolean is false" ),
                   () -> assertTrue( random2, "2nd random boolean is false" ),
                   () -> assertTrue( random3, "3rd random boolean is false" )
        );
    }

}
