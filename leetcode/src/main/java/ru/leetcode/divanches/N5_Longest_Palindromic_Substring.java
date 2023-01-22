package ru.leetcode.divanches;

/**
 * 5. Longest Palindromic Substring
 * Medium
 * 23.5K
 * 1.4K
 * Companies
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */

public class N5_Longest_Palindromic_Substring {
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }

        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;
                    start = i;
                    maxLength = k;
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    int start, end, maxLength = Integer.MIN_VALUE;

    public String longestPalindrome2(String inputStr) {

        /**
         * Base case :
         * If the string is Empty or single character string then return it.
         */
        if (inputStr.length() < 2) {
            return inputStr;
        }

        for (int index = 0; index < inputStr.length() - 1; index++) {
            /**
             * we are calling the same function twice because we are not sure
             * the substring size will be of even or odd.
             *
             * If odd then we will be getting a middle point like for the String
             * "abcdcba" middle will be 3 i.e. character 'd'
             *
             * but for the even number the middle will be 2 position like for
             * the String "xyzzyx" middle will be 2 and 3 position
             *
             */
            expandSearch(inputStr, index, index);
            expandSearch(inputStr, index, index + 1);
        }

        return inputStr.substring(start, end);
    }

    private void expandSearch(String inputStr, int startPosition, int endPosition) {

        while (startPosition >= 0 && endPosition < inputStr.length()
                && inputStr.charAt(startPosition) == inputStr.charAt(endPosition)) {

            startPosition--;
            endPosition++;
        }

        int substringLength = endPosition - startPosition - 1;

        /**
         * Keeping track of the max SubString length and corresponding start and end
         */
        if (substringLength > maxLength) {
            this.start = startPosition + 1;
            end = endPosition;
            this.maxLength = substringLength;
        }
    }
}
