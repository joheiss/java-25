package com.jovisco.tutorial.java25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("main test")
    void test() {
        assertEquals(4, 2+2);
    }
}