package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N424_Longest_Repeating_Character_ReplacementTest {

    @Test
    void characterReplacement1() {
        assertEquals(4, N424_Longest_Repeating_Character_Replacement.characterReplacement("ABAB", 2));
    }

    @Test
    void characterReplacement2() {
        assertEquals(6, N424_Longest_Repeating_Character_Replacement.characterReplacement("AABABBBBAABABBA", 1));
    }
}