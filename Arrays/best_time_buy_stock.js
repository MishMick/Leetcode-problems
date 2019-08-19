//Say you have an array for which the ith element is the price of a given stock on day i.

//If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

//Note that you cannot sell a stock before you buy one.

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let minPrice = Infinity;
    let maxProfit = 0;
    prices.forEach((price, idx) => {
        if (price < minPrice) minPrice = price;
        const profit = price - minPrice;
        if (profit > maxProfit) maxProfit = profit;
    })
    return maxProfit;
};

/* Performance
* Runtime: 64 ms, faster than 50.66% of JavaScript online submissions for Best Time to Buy and Sell Stock.
* Memory Usage: 35.2 MB, less than 96.30% of JavaScript online submissions for Best Time to Buy and Sell Stock.
*/