package com.github.akutschera.condition;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ContainerExecutionCondition;
import org.junit.jupiter.api.extension.ContainerExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class NeverExecuteCondition implements ContainerExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluate( ContainerExtensionContext context ) {
        String name = context.getDisplayName();
        if ( name.contains( "ContainerConditionTest" ) ) {
            return ConditionEvaluationResult.disabled( "we never execute this test" );
        } else {
            return ConditionEvaluationResult.enabled( "we execute all test classes NOT named ContainerConditionTest" );
        }
    }
}
