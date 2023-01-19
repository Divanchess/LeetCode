package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N191_Number_of_1_BitsTest {

    @Test
    void hammingWeight1() {
        // 11 = 00000000000000000000000000001011
        assertEquals(3, N191_Number_of_1_Bits.hammingWeight(11));
    }

    @Test
    void hammingWeight2() {
        // 128 = 00000000000000000000000010000000
        assertEquals(1, N191_Number_of_1_Bits.hammingWeight(128));
    }

    @Test
    void hammingWeight3() {
        // -3 = 11111111111111111111111111111101
        assertEquals(31, N191_Number_of_1_Bits.hammingWeight(-3));
    }
}