package com.github.akutschera.extension.junit5.p06parameters;

import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(JUnitPlatform.class)
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
