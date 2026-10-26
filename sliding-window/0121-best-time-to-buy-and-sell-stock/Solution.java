// LeetCode 121 - Best Time to Buy and Sell Stock | Easy
// Brute force: O(n^2) (every buy day x every later sell day)  ->  Optimal: O(n) time, O(1) space.
// Key idea: track the cheapest price seen so far; each day, profit = price - cheapest.
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                ans = Math.max(prices[i] - min, ans);
            }
        }
        return ans;
    }
}
