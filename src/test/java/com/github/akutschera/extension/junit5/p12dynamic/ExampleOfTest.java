package com.github.akutschera.extension.junit5.p12dynamic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

/**
 * Created by Andreas Kutschera.
 */
public class ExampleOfTest {

    private static int staticVar;
    private static int numberOfCalls;
    private int beforeEachVar;

    @BeforeAll
    public static void beforeAll() {
        staticVar = 2;
        numberOfCalls = 0;
    }

    @BeforeEach
    void beforeEachVar() {
        beforeEachVar = numberOfCalls++;
    }

    @TestFactory
    @DisplayName("@BeforeAll can be accessed")
    Stream<DynamicTest> befo() {
        return Stream.of( dynamicTest( "beforeAll is executed (obviously)", () -> assertEquals( 2, staticVar ) ) );
    }

    @TestFactory
    @DisplayName("@BeforeEach is not executed for dynamic tests")
    Stream<DynamicTest> beforeEachTest() {
        final int startVar = beforeEachVar;
        return Stream.of( dynamicTest( "first test (should pass)", () -> {
                              assertEquals( startVar, beforeEachVar );
                              assertTrue( startVar < 2 );
                          } )
                , dynamicTest( "second test (should pass b/c beforeEach is NOT executed)", () -> {
                    assertEquals( startVar, beforeEachVar );
                    assertTrue( startVar < 2 );
                } ) );
    }

}
