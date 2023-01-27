package ru.leetcode.divanches;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 * Hard
 * 14.1K
 * 613
 * Companies
 * Given two strings s and t of lengths m and n respectively, return the minimum window
 * substring
 *  of s such that every character in t (including duplicates) is included in the window.
 *  If there is no such substring, return the empty string "".
 *
 * The testcases will be generated such that the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * Example 2:
 *
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * Example 3:
 *
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 *
 *
 * Constraints:
 *
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 105
 * s and t consist of uppercase and lowercase English letters.
 *
 *
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 */

public class N76_Minimum_Window_Substring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException();
        }

        String result = "";
        if (s.length() < t.length()) {
            return result;
        }

        // Мапа букв 2го слова
        Map<Character, Integer> tmap = new HashMap<>();
        // Мапа букв 1го слова, которая будет содержать буквы просматриваемого окна
        Map<Character, Integer> smap = new HashMap<>();

        // Посчитали буквы 2го слова
        for (int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }

        // Левый указатель, который будем двигать для уменьшения окна
        int start = 0;
        // Значение минимального окна, которое будем использовать для сравнения в поиске минимального
        int minWindow = Integer.MAX_VALUE;
        // Счетчик найденных букв из 2го слова
        int have = 0;
        // Сколько нужно найти букв из 2го слова
        int need = t.length();

        for (int end = 0; end < s.length(); end++) {
            // В этом цикле мы идем по 1ому слову и ищем совпадения букв из 2го слова
            char ch = s.charAt(end);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);
            if (tmap.containsKey(ch) && smap.get(ch) <= tmap.get(ch)) {
                have++;
            }
            // Если мы встретили все буквы из 2го слова - мы начинаем искать минимальное окно
            // Двигая указатель слева start на +1
            // Когда мы сдвигаем указатель вправо мы также должны удалить из мапы окна 1го слова букву
            // А если удаленная буква была из необходимых букв 2го слова - уменьшить переменную have
            while (have == need) {
                if (minWindow > end - start + 1) {
                    minWindow = end - start + 1;
                    result = s.substring(start, end + 1);
                }
                Character charToRemove = s.charAt(start);
                // удаляем букву из мапы окна
                if (smap.get(charToRemove) == 0) {
                    smap.remove(charToRemove);
                } else {
                    smap.put(charToRemove, smap.get(charToRemove) - 1);
                }
                // двигаем левый указатель
                start++;
                // уменьшаем счетчик имеющихся букв, если бука на позиции start была из нужных
                // (была в мапе и кол-во буквы стало меньше чем в мапе 2го слова)
                if (tmap.containsKey(charToRemove) && smap.getOrDefault(charToRemove, 0) < tmap.get(charToRemove)) {
                    have--;
                }
            }
        }
        return result;
    }
}
