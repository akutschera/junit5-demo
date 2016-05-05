package com.github.akutschera.condition;

import org.junit.gen5.api.extension.ConditionEvaluationResult;
import org.junit.gen5.api.extension.ContainerExecutionCondition;
import org.junit.gen5.api.extension.ContainerExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class NeverExecuteCondition implements ContainerExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluate( ContainerExtensionContext context ) {
        String name = context.getName();
        if ( name.contains( "ContainerConditionTest" ) ) {
            return ConditionEvaluationResult.disabled( "we never execute this test" );
        } else {
            return ConditionEvaluationResult.enabled( "we execute all test classes NOT named ContainerConditionTest" );
        }
    }
}
