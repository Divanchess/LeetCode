package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N647_Palindromic_SubstringsTest {

    @Test
    void countSubstrings1() {
        assertEquals(3, N647_Palindromic_Substrings.countSubstrings("abc"));
    }

    @Test
    void countSubstrings2() {
        assertEquals(6, N647_Palindromic_Substrings.countSubstrings("aaa"));
    }
}