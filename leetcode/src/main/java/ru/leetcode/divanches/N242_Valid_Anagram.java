package ru.leetcode.divanches;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * Easy
 * 8K
 * 260
 * Companies
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length, t.length <= 5 * 104
 * s and t consist of lowercase English letters.
 *
 *
 * Follow up: What if the inputs contain Unicode characters?
 * How would you adapt your solution to such a case?
 */

public class N242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            if (counts[index] == 0) {
                return false;
            }
            counts[index]--;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        Map<Character, Integer> lettersCountWord1 = new HashMap<>();
        Map<Character, Integer> lettersCountWord2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i=0; i< s.length(); i++) {
            char charWord1 = s.charAt(i);
            char charWord2 = t.charAt(i);
            lettersCountWord1.put(charWord1, lettersCountWord1.getOrDefault(charWord1, 0) + 1);
            lettersCountWord2.put(charWord2, lettersCountWord2.getOrDefault(charWord2, 0) + 1);
        }
        for (Character key : lettersCountWord1.keySet()) {
            if (!lettersCountWord2.containsKey(key) || !lettersCountWord1.get(key).equals(lettersCountWord2.get(key))) {
                return false;
            }
        }
        return true;
    }
}
