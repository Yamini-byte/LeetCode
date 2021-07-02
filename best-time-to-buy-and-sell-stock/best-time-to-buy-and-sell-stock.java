class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            profit += (prices[i]-prices[i-1]);
            if(profit>maxProfit) maxProfit = profit;
            if(profit<0){
                profit = 0;
            }
        }
        return maxProfit;
    }
}