package com.github.akutschera.extension.junit5.p06parameters;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ObjectArrayArguments;
import org.junit.jupiter.params.provider.ValueSource;
import org.opentest4j.AssertionFailedError;

/**
 * Created by Andreas Kutschera.
 */
@DisplayName("junit-jupiter-params adds a new @ParameterizedTest feature")
public class ParameterizedAnnotationTest {

    @ParameterizedTest
    @ValueSource(strings = { "foo, bar" })
    void testWithStrings( String arg ) {
        assertNotNull( arg );
    }

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6 })
    void allValuesShouldBeEven( int num ) {
        assertThat( num % 2 ).as( num + " was not even" ).isEqualTo( 0 );
    }

    @ParameterizedTest(name = "{index} ==> color=''{0}''")
    @EnumSource(COLOR.class)
    void enumsCanBeInjectedToo( COLOR color ) {
        try {
            assertEquals( color, COLOR.BLACK );
        } catch ( AssertionFailedError ex ) {
            assertEquals( color, COLOR.WHITE );
        }
    }

    enum COLOR {
        BLACK,
        WHITE
    }

    @ParameterizedTest
    @MethodSource(names = "paramsProvider")
    @CsvSource(delimiter = '|', value = {
            "3 | 3",
            "4 | 4"
    })
    @DisplayName( "combining parameter sources works too" )
    void spockLikeParameters(int num, String text) {
        assertThat( Integer.parseInt( text ) ).isEqualTo( num );
    }

    static List<Arguments> paramsProvider() {
        List<Arguments> arguments = new ArrayList<>( 2 );
        arguments.add( ObjectArrayArguments.create( 1, "1" ) );
        arguments.add( ObjectArrayArguments.create( 2, "2" ) );
        return arguments;
    }

}
