package com.github.akutschera.extension.junit5.p14testinstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_METHOD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


/**
 * Created by Andreas Kutschera.
 * <p>
 * This test demonstrates the possibility to instantiate this test class for every test (the default)
 */
@TestInstance(PER_METHOD)
public class TestInstancePerMethodTest {

    int numberOfExecutions = 0;

    @RepeatedTest(2)
    @DisplayName("each repetition does not change the internal state of a field")
    void repeatedTestsCanBeUsedInTestInstance() {
        assertThat( numberOfExecutions ).isEqualTo( 0 );
        numberOfExecutions++;
    }

    @Test
    @DisplayName("@Test can be used in testInstance per class")
    void aaaExecuteLaterBecauseOfExecutionOrder() {
        assertThat( numberOfExecutions ).isEqualTo( 0 );
    }

}

