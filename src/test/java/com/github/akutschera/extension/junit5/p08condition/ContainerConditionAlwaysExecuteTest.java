package com.github.akutschera.extension.junit5.p08condition;

import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import com.github.akutschera.condition.NeverExecuteCondition;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnit5.class )
@ExtendWith(NeverExecuteCondition.class)
public class ContainerConditionAlwaysExecuteTest {

    @Test
    @DisplayName( "When container condition says yes" )
    void pleaseExecute() {
        assertTrue(true);
    }

}
