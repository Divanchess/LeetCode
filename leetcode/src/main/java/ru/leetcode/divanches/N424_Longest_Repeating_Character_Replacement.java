package ru.leetcode.divanches;

/**
 * 424. Longest Repeating Character Replacement
 * Medium
 * 7.2K
 * 289
 * Companies
 * You are given a string s and an integer k. You can choose any character
 * of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter
 * you can get after performing the above operations.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 * Example 2:
 *
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
 * The substring "BBBB" has the longest repeating letters, which is 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s consists of only uppercase English letters.
 * 0 <= k <= s.length
 */

public class N424_Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k) {
        // Массив с индексами Char - 'A'
        int[] arr = new int[26];
        int largestCount = 0, start = 0, maxlen = 0;
        // Пройдемся по всем буквам.
        // Решение методом скользящего окна.
        // При этом в определении кол-ва максимально допустимых замен нам помогут кол-во подсчитанных букв
        for(int end = 0; end < s.length(); end ++){
            // Добавляем +1 к букве
            arr[s.charAt(end) - 'A']++;
            // Определяем самую большую последовательность чисел
            largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
            // Если в получившемся окне замен больше, чем k - сдвигаем начальный указатель на +1, уменьшаем окно
            // При этом, уменьшать максимально имееющееся у нас число повторяющихся символов нет большого смысла,
            // поскольку нам нужно найти больше, чтобы перебить максимальную длину строки
            if(end - start + 1 - largestCount > k){
                // Здесь мы уменьшаем текущее число символов в окне
                arr[s.charAt(start) - 'A']--;
                // И уменьшаем окно
                start ++;
            }
            // Максимальное получившееся число символов с учетом замены
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
}
