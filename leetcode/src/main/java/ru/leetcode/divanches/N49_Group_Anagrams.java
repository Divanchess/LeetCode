package ru.leetcode.divanches;

import java.util.*;

/**
 * 49. Group Anagrams
 * Medium
 * 14K
 * 412
 * Companies
 * Given an array of strings strs, group the anagrams together.
 * You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */

public class N49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            throw new IllegalArgumentException();
        }

        List<List<String>> result = new ArrayList<>();

        if (strs.length == 1) {
            result.add(Collections.singletonList(strs[0]));
            return result;
        }

        int[] seen = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (seen[i] == 0) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (isAnagram(strs[i], strs[j])) {
                        anagrams.add(strs[j]);
                        seen[j] = 1;
                    }
                }
                result.add(anagrams);
            }
            seen[i] = 1;
        }
        return result;
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> letters = new HashMap<>();
        for (Character c : s.toCharArray()) {
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }
        for (Character c : t.toCharArray()) {
            if (!letters.containsKey(c) || letters.get(c) == 0) {
                return false;
            }
            letters.put(c, letters.get(c) - 1);
        }
        return true;
    }

    /**
     * Short solution from leetcode
     */
    public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
