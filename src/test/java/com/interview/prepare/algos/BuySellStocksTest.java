package com.interview.prepare.algos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuySellStocksTest {

    @Test
    public void maxProfit3() {
        BuySellStocks stocks = new BuySellStocks();
        int[] ticker = {3,3,5,0,0,3,1,4};
        Assert.assertEquals(6, stocks.maxProfit3(ticker));
    }
}