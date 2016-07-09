package com.github.akutschera.extension.junit5.p07interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 * Created by Andreas Kutschera.
 */
@RunWith( JUnitPlatform.class )
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
