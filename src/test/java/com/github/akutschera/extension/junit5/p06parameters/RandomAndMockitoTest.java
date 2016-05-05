package com.github.akutschera.extension.junit5.p06parameters;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

import com.github.akutschera.extension.mockito.InjectMock;
import com.github.akutschera.extension.mockito.MockitoExtension;
import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnit5.class )
@ExtendWith( { MockitoExtension.class, RandomExtension.class} )
@DisplayName( "When using multiple extensions" )
public class RandomAndMockitoTest {

    @Test
    @DisplayName( "we can inject a mock  and another random int into a test" )
    void simpleTestWithInjectedMock( @InjectMock Person person, Boolean random ) {
        when( person.getName() ).thenReturn( "Dieter again" );

        assertEquals( "Dieter again", person.getName() );
        assertTrue( random,"may fail occasionally when the random boolean is False by chance" );
    }

}
