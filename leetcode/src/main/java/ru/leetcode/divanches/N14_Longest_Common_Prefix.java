package ru.leetcode.divanches;

/**
 * 14. Longest Common Prefix
 * Easy
 *
 * 12416
 *
 * 3711
 *
 * Add to List
 *
 * Share
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

public class N14_Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            throw new IllegalArgumentException();
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int minWordLength = Integer.MAX_VALUE;
        int[] chars = new int[26];
        int j = 0; // char index
        StringBuilder builder = new StringBuilder();
        while (j < minWordLength) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].equals("")) {
                    return "";
                }
                minWordLength = Math.min(strs[i].length(), minWordLength);
                char currentLetter = strs[i].charAt(j);
                chars[currentLetter - 'a']++;
                if (chars[currentLetter - 'a'] != i + 1) {
                    return builder.toString();
                } else if (chars[currentLetter - 'a'] == strs.length) {
                    builder.append(currentLetter);
                    chars[currentLetter - 'a'] = 0;
                    j++;
                }
            }
        }
        return builder.toString();
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
