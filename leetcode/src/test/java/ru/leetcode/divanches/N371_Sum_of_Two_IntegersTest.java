package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N371_Sum_of_Two_IntegersTest {

    @Test
    void getSum1() {
        assertEquals(3, N371_Sum_of_Two_Integers.getSum(1, 2));
    }

    @Test
    void getSum2() {
        assertEquals(5, N371_Sum_of_Two_Integers.getSum(2, 3));
    }
}