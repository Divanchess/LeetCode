package ru.leetcode.divanches;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


// #3
public class N3_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        for (String testString : Arrays.asList("abca123a45678a90a", "abca", "1111", "221331")) {
            int result = compute(testString);
            System.out.println("The longest substring length without repeating characters : " + result);
        }
    }

    public static int compute(String s) {
        if (s == null) throw new IllegalArgumentException("Incoming string is null");
        if ("".equals(s)) return 0;
        if (s.length() == 1) return 1;

        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < s.length(); j++) {
            Character character = s.charAt(j);
            i = Math.max(i, map.get(character) == null ? 0 : map.get(character));
            maxLength = Math.max(maxLength, j - i + 1);
            map.put(character, j + 1);
        }

        return maxLength;
    }
}
