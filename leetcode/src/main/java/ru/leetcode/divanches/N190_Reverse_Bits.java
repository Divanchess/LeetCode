package ru.leetcode.divanches;

/**
 * 190. Reverse Bits
 * Easy
 * 4K
 * 1K
 * Companies
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Note:
 *
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, both input and output will be given as a signed integer type.
 * They should not affect your implementation, as the integer's internal binary
 * representation is the same, whether it is signed or unsigned.
 *
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 2 above, the input represents the signed integer -3 and the
 * output represents the signed integer -1073741825.
 *
 *
 * Example 1:
 *
 * Input: n = 00000010100101000001111010011100
 * Output:    964176192 (00111001011110000010100101000000)
 * Explanation: The input binary string 00000010100101000001111010011100 represents
 * the unsigned integer 43261596, so return 964176192 which its binary representation
 * is 00111001011110000010100101000000.
 * Example 2:
 *
 * Input: n = 11111111111111111111111111111101
 * Output:   3221225471 (10111111111111111111111111111111)
 * Explanation: The input binary string 11111111111111111111111111111101 represents
 * the unsigned integer 4294967293, so return 3221225471 which its binary representation
 * is 10111111111111111111111111111111.
 *
 *
 * Constraints:
 *
 * The input must be a binary string of length 32
 *
 *
 * Follow up: If this function is called many times, how would you optimize it?
 */

public class N190_Reverse_Bits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 1; i <= 32; i++) {
            // здесь least significant bit (LSB) результата всегда будет равен 0
            // 0 получается после сдвига в последнем шаге цикла
            // 0 на конце - это всегда нечетное число (2^0 в в последнем бите отсутствует, то есть число минус 1)
            // таким образом мы всегда определяем последний бит путем прибавления или не прибавления единицы
            // (в зависимости от результата сложения исходного числа с 1)
            result += n & 1;
            n >>>= 1;   // сдвиг всегда делаем беззнаковый, unsigned shift
            if (i < 32) { // на последнем шаге, 32ой раз цикла, чтобы оставить получившиеся 32 бита - мы не делаем сдвиг
                result <<= 1;
            }
        }
        return result;
    }
}
