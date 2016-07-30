package com.github.akutschera.extension.junit5.p07interfaces;

import org.junit.jupiter.api.BeforeEach;

/**
 * Created by Andreas Kutschera.
 */
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
