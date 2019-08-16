package com.github.akutschera.extension.junit5.p06parameters;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Created by Andreas Kutschera.
 */

@ExtendWith(MockitoExtension.class)
@DisplayName( "With Mockito Extension" )
public class MockitoExampleTest {


    @Test
    @DisplayName( "we can inject a previously initialized mock into a test" )
    void simpleTestWithInjectedMock( @Mock Person person ) {
        when( person.getName() ).thenReturn( "Dieter" );
        assertEquals( "Dieter", person.getName() );
    }

}
