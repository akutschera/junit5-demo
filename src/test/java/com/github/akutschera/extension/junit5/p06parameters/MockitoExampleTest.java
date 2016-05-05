package com.github.akutschera.extension.junit5.p06parameters;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import com.github.akutschera.extension.mockito.InjectMock;
import com.github.akutschera.extension.mockito.MockitoExtension;

/**
 * Created by Andreas Kutschera.
 */

@RunWith( JUnit5.class )
@ExtendWith(MockitoExtension.class)
@DisplayName( "With Mockito Extension" )
public class MockitoExampleTest {


    @Test
    @DisplayName( "we can inject a previously initialized mock into a test" )
    void simpleTestWithInjectedMock( @InjectMock Person person ) {
        when( person.getName() ).thenReturn( "Dieter" );
        assertEquals( "Dieter", person.getName() );
    }

}
