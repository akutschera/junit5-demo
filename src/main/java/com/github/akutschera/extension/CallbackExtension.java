package com.github.akutschera.extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ContainerExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class CallbackExtension implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void afterAll( ContainerExtensionContext containerExtensionContext ) throws Exception {
        System.out.println("after All " + containerExtensionContext.getDisplayName());
    }

    @Override
    public void beforeAll( ContainerExtensionContext containerExtensionContext ) throws Exception {
        System.out.println("before All " + containerExtensionContext.getDisplayName());
    }
}
