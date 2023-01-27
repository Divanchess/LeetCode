package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N76_Minimum_Window_SubstringTest {

    @Test
    void minWindow1() {
        assertEquals("BANC", N76_Minimum_Window_Substring.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow2() {
        assertEquals("a", N76_Minimum_Window_Substring.minWindow("a", "a"));
    }

    @Test
    void minWindow3() {
        assertEquals("", N76_Minimum_Window_Substring.minWindow("a", "aa"));
    }
}