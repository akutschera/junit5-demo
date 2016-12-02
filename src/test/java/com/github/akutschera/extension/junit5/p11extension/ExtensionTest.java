package com.github.akutschera.extension.junit5.p11extension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.junit5.p06parameters.Person;
import com.github.akutschera.extension.mockito.InjectMock;
import com.github.akutschera.extension.mockito.MockitoExtension;
import com.github.akutschera.extension.random.RandomExtension;

/**
 * Created by Andreas Kutschera.
 */
public class ExtensionTest {

    //    @ExtendWith( RandomExtension.class )
    Boolean fieldWithExtension1;
    Boolean fieldWithExtension2;

    @Test
    @DisplayName("we can use an extension on the field level")
    @ExtendWith(RandomExtension.class)
    @Disabled("wait until M4 comes out")
    void useExtensionOnField() {
        assertAll( () -> Assertions.assertTrue( fieldWithExtension1, "failed because 1st random boolean is false" ),
                   () -> Assertions.assertTrue( fieldWithExtension2, "failed because 2nd random boolean is false" )
        );
    }


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
    void simpleTestWithInjectedMock( @InjectMock Person person ) {
        when( person.getName() ).thenReturn( "Dieter" );
        assertEquals( "Dieter", person.getName() );
    }
}
