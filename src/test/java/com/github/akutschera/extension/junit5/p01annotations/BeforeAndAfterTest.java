package com.github.akutschera.extension.junit5.p01annotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Andreas Kutschera.
 */
public class BeforeAndAfterTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println( "Before ALL\n" );
    }

    @AfterAll
    public static void afterAll() {
        System.out.println( "\nAfter ALL" );
    }

    @BeforeEach
    public void printsomething() {
        System.out.println( "\nbefore each test" );
    }

    @AfterEach
    public void afterEight() {
        System.out.println( "after each test" );
    }

    @Test
    public void test1() {
        System.out.println( "running test 1" );
    }

    @Test
    public void test2() {
        System.out.println( "running test 2" );
    }
}
