// LeetCode: Richest Customer Wealth
// Student: Sahil | Registration No.: 12527642

class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) wealth += money;
            richest = Math.max(richest, wealth);
        }
        return richest;
    }
}
