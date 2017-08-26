package com.github.akutschera.extension.junit5.p06parameters;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.mockito.InjectMock;
import com.github.akutschera.extension.mockito.MockitoExtension;
import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
@ExtendWith( { MockitoExtension.class, RandomExtension.class} )
@DisplayName( "When using multiple extensions" )
public class RandomAndMockitoTest {

    @Test
    @DisplayName( "we can inject a mock  and another random int into a test" )
    @Tag("may-fail")
    void simpleTestWithInjectedMock( @InjectMock Person person, Boolean random ) {
        when( person.getName() ).thenReturn( "Dieter again" );

        assertEquals( "Dieter again", person.getName() );
        assertTrue( random,"may fail occasionally when the random boolean is False by chance" );
    }

}
