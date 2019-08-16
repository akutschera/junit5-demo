package com.github.akutschera.extension.junit5.p11extension;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Created by Andreas Kutschera.
 */
public class UsePropertyExtension implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void beforeAll( ExtensionContext extensionContext ) throws Exception {
        String previouslySet = System.getProperty( "extension.property", "unset" );
        System.setProperty( "use.extension.property",previouslySet );
    }

    @Override
    public void afterAll( ExtensionContext extensionContext ) throws Exception {
        System.clearProperty( "use.extension.property" );
    }
}
