package ru.leetcode.divanches;

/**
 * 371. Sum of Two Integers
 * Medium
 * 3.3K
 * 4.6K
 * Companies
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 *
 *
 *
 * Example 1:
 *
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 *
 * Input: a = 2, b = 3
 * Output: 5
 *
 *
 * Constraints:
 *
 * -1000 <= a, b <= 1000
 */
public class N371_Sum_of_Two_Integers {
    public static int getSum(int a, int b) {
        // будем идти по одному из чисел, а изменять биты другого, который и будет результатом
        while (b != 0) { // идем по b
            // Десятки и последующий перенос определим так:
            int carry = a & b; // в верхних битах останутся единицы, которые должны перейти выше (для случая 1 + 1)
            a = a ^ b; // это биты, которые получились в результате сложения, без учета верхних битов
            b = carry << 1; // переносим десятки наверх
        }
        return a;
    }
}
