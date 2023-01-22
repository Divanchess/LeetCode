package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N5_Longest_Palindromic_SubstringTest {

    @Test
    void longestPalindrome1() {
        assertEquals("aba", N5_Longest_Palindromic_Substring.longestPalindrome("babad"));
    }

    @Test
    void longestPalindrome2() {
        assertEquals("bb", N5_Longest_Palindromic_Substring.longestPalindrome("cbbd"));
    }
}