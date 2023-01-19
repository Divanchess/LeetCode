package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N338_Counting_BitsTest {

    @Test
    void countBits1() {
        assertArrayEquals(new int[]{0,1,1}, N338_Counting_Bits.countBits(2));
    }

    @Test
    void countBits2() {
        assertArrayEquals(new int[]{0,1,1,2,1,2}, N338_Counting_Bits.countBits(5));
    }
}