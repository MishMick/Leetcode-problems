//Say you have an array for which the ith element is the price of a given stock on day i.

//Design an algorithm to find the maximum profit. 
//You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

import java.util.*;
class Solution {
     public int maxProfit(int[] prices) {
        if(prices == null || prices.length==0)
            return 0;
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                profit += prices[i+1]-prices[i];
            }
        }
        return profit;
    }
}

/**
* Runtime: 1 ms, faster than 95.23% of Java online submissions for Best Time to Buy and Sell Stock II.
* Memory Usage: 37.4 MB, less than 99.91% of Java online submissions for Best Time to Buy and Sell Stock II.
**/
