package com.github.akutschera.extension.junit5.p07interfaces;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.junit4.runner.JUnit5;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnit5.class )
public class StringStorageTest implements StorageTestInterface<String> {

    private String testString;


    @BeforeEach
    void setup() {
        testString = "test";
    }


    @Override
    public String createObject() {
        return testString;
    }

    @Override
    public Storage<String> createStorage() {
        return new StringStorage();
    }
}
