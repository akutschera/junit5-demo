package com.github.akutschera.extension.junit5.p14testinstance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


/**
 * Created by Andreas Kutschera.
 * <p>
 * This test demonstrates the possibility to instantiate this test class only once.
 * That might come in handy when instantiation takes quite some time.
 *
 *
 */
@TestInstance(PER_CLASS)
public class TestInstancePerClassTest {

    int numberOfExecutions = 42;

    @BeforeAll
    public /* static not needed when you use per_class */ void setUpBeforeAll() {
        numberOfExecutions = 1;
    }

    @RepeatedTest( 2 )
    @DisplayName( "each repetition changes the internal state of a field" )
    void repeatedTestsCanBeUsedInTestInstance( RepetitionInfo repetitionInfo) {
        assertThat(numberOfExecutions).isEqualTo( repetitionInfo.getCurrentRepetition());
        numberOfExecutions++;
    }

    @Test
    @DisplayName( "@Test can be used in testInstance per class" )
    void aaaExecuteLaterBecauseOfExecutionOrder() {
        assertThat( numberOfExecutions ).isGreaterThan( 1 );
    }

}

