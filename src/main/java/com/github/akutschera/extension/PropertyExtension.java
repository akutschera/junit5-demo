package com.github.akutschera.extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class PropertyExtension implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void beforeAll( ExtensionContext extensionContext ) throws Exception {
        System.setProperty( "extension.property", "42" );
    }

    @Override
    public void afterAll( ExtensionContext extensionContext ) throws Exception {
        System.clearProperty( "extension.property" );
    }
}
