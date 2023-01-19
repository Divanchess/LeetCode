package ru.leetcode.divanches;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class N121_Best_Time_to_Buy_and_Sell_StockTest {
    @Test
    public void maxProfitTest1() {
        int[] array = new int[]{7,1,5,3,6,4};
        assertEquals(5, N121_Best_Time_to_Buy_and_Sell_Stock.maxProfit(array));
    }

    @Test
    public void maxProfitTest2() {
        int[] array = new int[]{7,6,4,3,1};
        assertEquals(0, N121_Best_Time_to_Buy_and_Sell_Stock.maxProfit(array));
    }

    @Test
    public void maxProfitTest3() {
        int[] array = new int[]{2,4,1};
        assertEquals(2, N121_Best_Time_to_Buy_and_Sell_Stock.maxProfit(array));
    }

    @Test
    public void maxProfitTest4() {
        int[] array = new int[]{3,2,6,5,0,3};
        assertEquals(4, N121_Best_Time_to_Buy_and_Sell_Stock.maxProfit(array));
    }
}