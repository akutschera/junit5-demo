package com.github.akutschera.extension.junit5.p07interfaces;

/**
 * Created by Andreas Kutschera.
 */
public interface Storage<T> {

    Object store( T storable);

    T retrieve( Object key );
}
