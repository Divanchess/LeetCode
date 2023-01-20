package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N190_Reverse_BitsTest {

    @Test
    void reverseBits1() {
        /**
         * Input: n = 00000010100101000001111010011100
         * Output:    964176192 (00111001011110000010100101000000)
         * Explanation: The input binary string 00000010100101000001111010011100
         * represents the unsigned integer 43261596, so return 964176192 which its
         * binary representation is 00111001011110000010100101000000.
         */
        assertEquals(964176192 , N190_Reverse_Bits.reverseBits(43261596));
    }

    @Test
    void reverseBits2() {
        /**
         Input: n = 11111111111111111111111111111101
         Output:   3221225471 (10111111111111111111111111111111)
         Explanation: The input binary string 11111111111111111111111111111101
         represents the unsigned integer 4294967293, so return 3221225471 which its
         binary representation is 10111111111111111111111111111111.
         */
        assertEquals(-1073741825 , N190_Reverse_Bits.reverseBits(-3));
    }
}