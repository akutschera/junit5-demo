package com.github.akutschera.extension.junit5.p07interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Andreas Kutschera.
 */
public class StringStorage implements Storage<String> {

    private Map<Object, String> storageMap = new HashMap<>();

    @Override
    public Object store( String storable ) {
        Integer random = new Random(  ).nextInt();
        storageMap.put( random, storable );
        return random;
    }

    @Override
    public String retrieve( Object key ) {
        return storageMap.get( key );
    }
}
