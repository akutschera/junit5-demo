package com.github.akutschera.extension.junit5.p13repeated;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

/**
 * Created by Andreas Kutschera.
 */
public class RepeatedAnnotationTest {

    @RepeatedTest( 2 )
    void testTwice() {
        assertEquals( 2, 2 );
    }

    @RepeatedTest( 2 )
    @DisplayName( "access repetition info inside test" )
    void withInfo( RepetitionInfo repetitionInfo) {
        assertEquals(2, repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest( value = 2, name = "{displayName} :: {currentRepetition}/{totalRepetitions}")
    @DisplayName( "repeat with parameters" )
    void repeatWithReadableTestName() {
        assertEquals( 2, 2 );
    }


}
