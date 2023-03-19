package com.leetcode;

public class StockPrice {
    public static int getprofit(int[] stocks)
    {
        int i =0, profit=0;

        while(i < stocks.length)
        {
            while (i != stocks.length-1 && stocks[i] > stocks[i+1]) i++;

            int valley = stocks[i];

            while ( i != stocks.length-1 && stocks[i] < stocks[i+1]) i++;

            profit = profit + (stocks[i] - valley);

            i++;
        }
        return profit;
    }
    public static void main(String[] args)
    {
        int[] stocks = {7,1,15,17,8,9};

        System.out.println(getprofit(stocks));
    }
}
