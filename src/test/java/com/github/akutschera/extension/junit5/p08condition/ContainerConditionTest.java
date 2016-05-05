package com.github.akutschera.extension.junit5.p08condition;


import static org.junit.gen5.api.Assertions.fail;

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
public class ContainerConditionTest {

    @Test
    @DisplayName( "When container condition says no" )
    void doNotExecute() {
        fail( "this should not have been executed" );
    }

}
