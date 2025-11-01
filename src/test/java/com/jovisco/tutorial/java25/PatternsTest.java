package com.jovisco.tutorial.java25;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternsTest {

    @Test
    @DisplayName("test switch pattern matching")
    void testWhat() {
        var i = 4711;
        assertEquals("Integer", Patterns.what(i));
        var l = 815L;
        assertEquals("Long", Patterns.what(l));
        var s = "Oh my bloody ...";
        assertEquals("String", Patterns.what(s));
        var b = true;
        assertNotEquals("Boolean", Patterns.what(b));
    }

    @Test
    @DisplayName("test if pattern matching")
    void testWhatIf() {
        var i = 4711;
        assertEquals("INTEGER", Patterns.whatIf(i));
        var l = 815L;
        assertEquals("LONG", Patterns.whatIf(l));
        var s = "Oh my bloody ...";
        assertEquals("STRING", Patterns.whatIf(s));
        var b = true;
        assertEquals("BOOLEAN", Patterns.whatIf(b));
    }
}