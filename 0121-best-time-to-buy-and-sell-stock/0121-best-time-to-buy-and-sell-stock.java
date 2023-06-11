class Solution {
    public int maxProfit(int[] prices) {
        
        int sell_price = prices[prices.length - 1];
        int max_prof = 0;
        
        for (int i = prices.length - 2; i >= 0; i--) {
            
            if (prices[i] > sell_price) {
                sell_price = prices[i];
            }
            else {
                max_prof = Math.max(max_prof, sell_price - prices[i]);
            }
            
        }
        
        return max_prof;
        
    }
}