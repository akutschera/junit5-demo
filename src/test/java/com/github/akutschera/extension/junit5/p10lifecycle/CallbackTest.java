package com.github.akutschera.extension.junit5.p10lifecycle;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.github.akutschera.extension.CallbackExtension;

/**
 * Created by Andreas Kutschera.
 */
@ExtendWith(CallbackExtension.class)
public class CallbackTest {

    @Test
    void justSucceed() {}

    @Nested
    class NestedClass {
        @Test
        void justSucceed() {}

        @Nested
        class TripleNested {
            @Test
            void justSucceed() {}
        }
    }

    @Nested
    class AnotherNested {
        @Test
        void justSucceed() {}
    }
}
