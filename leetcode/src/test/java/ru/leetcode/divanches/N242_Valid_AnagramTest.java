package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N242_Valid_AnagramTest {

    @Test
    void isAnagram1() {
        assertEquals(true, N242_Valid_Anagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void isAnagram2() {
        assertEquals(false, N242_Valid_Anagram.isAnagram("rat", "car"));
    }
}