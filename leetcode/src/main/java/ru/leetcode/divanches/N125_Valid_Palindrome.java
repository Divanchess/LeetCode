package ru.leetcode.divanches;

/**
 * 125. Valid Palindrome
 * Easy
 * 5.8K
 * 6.5K
 * Companies
 * A phrase is a palindrome if, after converting all uppercase letters
 * into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */

public class N125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        if (s.length() == 1) {
            return true;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') ||
                    (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9')) {
                builder.append(Character.toLowerCase(c));
            }
        }
        String alphaNumericString = builder.toString();
        int len = alphaNumericString.length();
        for (int j = 0; j < len/2; j++) {
            if (alphaNumericString.charAt(j) != alphaNumericString.charAt(len - 1 - j)) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int length = cleaned.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
