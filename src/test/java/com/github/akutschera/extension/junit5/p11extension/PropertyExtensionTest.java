package com.github.akutschera.extension.junit5.p11extension;

import static java.lang.System.getProperty;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.PropertyExtension;

/**
 * Created by Andreas Kutschera.
 */
@ExtendWith({PropertyExtension.class, UsePropertyExtension.class})
class PropertyExtensionTest {

    @BeforeAll
    static void shouldBeSet() {
        assertThat( getProperty( "extension.property" ) ).isEqualTo( "42" );
    }

    @AfterAll
    static void shouldStillBeSet() {
        assertThat( getProperty( "extension.property" ) ).isEqualTo( "42" );
    }

    @Test
    @DisplayName("property can be used inside tests, and extensions are chained")
    void insideTest() {
        assertThat( getProperty( "use.extension.property" ) ).isEqualTo( "42" );
    }
}