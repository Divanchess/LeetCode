package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N14_Longest_Common_PrefixTest {

    @Test
    void longestCommonPrefix1() {
        String[] arr = new String[]{"flower", "flow","flight"};
        assertEquals("fl", N14_Longest_Common_Prefix.longestCommonPrefix(arr));
    }

    @Test
    void longestCommonPrefix2() {
        String[] arr = new String[]{"dog","racecar","car"};
        assertEquals("", N14_Longest_Common_Prefix.longestCommonPrefix(arr));
    }
}