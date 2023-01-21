package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N125_Valid_PalindromeTest {
    @Test
    void isPalindrome1() {
        assertTrue(N125_Valid_Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome2() {
        assertFalse(N125_Valid_Palindrome.isPalindrome("race a car"));
    }

    @Test
    void isPalindrome3() {
        assertTrue(N125_Valid_Palindrome.isPalindrome(" "));
    }
}