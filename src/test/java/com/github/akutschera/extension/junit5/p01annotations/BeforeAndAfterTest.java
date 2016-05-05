package com.github.akutschera.extension.junit5.p01annotations;

import org.junit.gen5.api.AfterAll;
import org.junit.gen5.api.AfterEach;
import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith(JUnit5.class)
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
