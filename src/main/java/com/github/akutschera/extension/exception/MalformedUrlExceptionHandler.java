package com.github.akutschera.extension.exception;

import java.net.MalformedURLException;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

/**
 * Created by Andreas Kutschera.
 */
public class MalformedUrlExceptionHandler implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException( ExtensionContext extensionContext, Throwable throwable ) throws Throwable {
        if (throwable instanceof MalformedURLException ) {
            System.out.println("will not run test with: " + throwable.getMessage());
            return;
        }
        throw throwable;
    }
}
