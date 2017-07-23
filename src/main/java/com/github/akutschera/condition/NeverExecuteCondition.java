package com.github.akutschera.condition;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class NeverExecuteCondition implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition( ExtensionContext context ) {
        String name = context.getDisplayName();
        if ( name.contains( "ContainerConditionTest" ) ) {
            return ConditionEvaluationResult.disabled( "we never execute this test" );
        } else {
            return ConditionEvaluationResult.enabled( "we execute all test classes NOT named ContainerConditionTest" );
        }
    }
}
