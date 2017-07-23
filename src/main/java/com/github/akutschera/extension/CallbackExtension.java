package com.github.akutschera.extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class CallbackExtension implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void afterAll( ExtensionContext containerExtensionContext ) throws Exception {
        System.out.println("after All " + containerExtensionContext.getDisplayName());
    }

    @Override
    public void beforeAll( ExtensionContext containerExtensionContext ) throws Exception {
        System.out.println("before All " + containerExtensionContext.getDisplayName());
    }
}
