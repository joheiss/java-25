package com.jovisco.tutorial.java25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScopedValueExampleTest {

    @Test
    @DisplayName("test scoped values")
    void testDoSomething() {
        new ScopedValueExample().doSomething();
        assertTrue(true);
    }
}