package com.github.akutschera.extension.junit5.p11extension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.github.akutschera.extension.junit5.p06parameters.Person;
import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
@Tag( "may-fail" )
public class ExtensionTest {

    @Test
    @DisplayName("we can use an extension on the method level")
    @ExtendWith(RandomExtension.class)
    void simpleTestWithInjectedRandom( Boolean random1, Boolean random2, Boolean random3 ) {
        assertAll( () -> Assertions.assertTrue( random1, "failed because 1st random boolean is false" ),
                   () -> Assertions.assertTrue( random2, "failed because 2nd random boolean is false" ),
                   () -> Assertions.assertTrue( random3, "failed because 3rd random boolean is false" )
        );
    }

    @Test
    @DisplayName("we can inject a previously initialized mock into a test")
    @ExtendWith(MockitoExtension.class)
    void simpleTestWithInjectedMock( @Mock Person person ) {
        when( person.getName() ).thenReturn( "Dieter" );
        assertEquals( "Dieter", person.getName() );
    }
}
