package com.github.akutschera.extension.junit5.p06parameters;

import java.util.HashMap;

import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestInfo;
import org.junit.gen5.api.TestReporter;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(JUnit5.class)
public class TestReporterTest {

    HashMap<String, String> values;

    @BeforeEach
    void start() {
        values = new HashMap<>();
    }

    @AfterEach
    void finish( TestReporter testReporter, TestInfo testInfo ) {
        values.put( "test name", testInfo.getDisplayName() );
        testReporter.publishEntry( values );
    }

    @Test
    @DisplayName( "add single value to output" )
    void addSingleValue() {
        values.put( "key", "value" );
    }

    @Test
    void addMultipleValues( TestReporter testReporter ) {
        values.put( "user name", "helmut12" );
        values.put( "championship year", "1954" );
    }
}
