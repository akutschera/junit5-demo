package com.github.akutschera.extension.junit5.p08condition;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.github.akutschera.condition.NeverExecuteCondition;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnitPlatform.class )
@ExtendWith(NeverExecuteCondition.class)
public class ContainerConditionAlwaysExecuteTest {

    @Test
    @DisplayName( "When container condition says yes" )
    void pleaseExecute() {
        assertTrue(true);
    }

}
