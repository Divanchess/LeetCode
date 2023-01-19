package ru.leetcode.divanches;

import java.util.HashMap;
import java.util.Map;

public class N13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println(romanToIntMap("XIII"));     // 13
        System.out.println(romanToIntMap("IX"));       // 9
        System.out.println(romanToIntMap("LVIII"));    // 58
        System.out.println(romanToIntMap("MCMXCIV"));  // 1994
        System.out.println(romanToIntMap("D"));        // 500

        System.out.println(romanToIntSwitch("XIII"));     // 13
        System.out.println(romanToIntSwitch("IX"));       // 9
        System.out.println(romanToIntSwitch("LVIII"));    // 58
        System.out.println(romanToIntSwitch("MCMXCIV"));  // 1994
        System.out.println(romanToIntSwitch("D"));        // 500
    }

    public static int romanToIntMap(String s) {
        Map<Character, Integer> numberByLetter = new HashMap<>();
        numberByLetter.put('I', 1);
        numberByLetter.put('V', 5);
        numberByLetter.put('X', 10);
        numberByLetter.put('L', 50);
        numberByLetter.put('C', 100);
        numberByLetter.put('D', 500);
        numberByLetter.put('M', 1000);

        if (s.length() == 1) return numberByLetter.get(s.charAt(0));

        int result = numberByLetter.get(s.charAt(s.length() - 1));

        for (int i = (s.length() - 2); i >= 0; i--) {
            int curr = numberByLetter.get(s.charAt(i));
            int prev = numberByLetter.get(s.charAt(i + 1));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }

    public static int romanToIntSwitch(String s) {
        if (s.length() == 1) return convertToInt(s.charAt(0));

        int result = convertToInt(s.charAt(s.length() - 1));

        for (int i = (s.length() - 2); i >= 0; i--) {
            int curr = convertToInt(s.charAt(i));
            int prev = convertToInt(s.charAt(i + 1));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        return result;
    }


    public static int convertToInt(Character ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }

        throw new Error("Illegal");
    }
}
