package com.github.akutschera.extension.junit5.p07interfaces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

/** Do <b>not</b> place an interface with the name *Test anywhere.
 * JUnit4 test discovery cannot handle that.
 *
 * Created by Andreas Kutschera.
 */
public interface StorageTestInterface<T> {

    T createObject();

    Storage<T> createStorage();

    @Test
    @DisplayName("retrieve must return previously stored object")
    default void storeRetrieve(  ) {
        Storage<T> storage = createStorage();

        T toStore = createObject();
        Object key = storage.store( toStore );
        T retrievedObj = storage.retrieve( key );

        assertThat( retrievedObj ).isEqualToComparingFieldByField( toStore );
    }
}
