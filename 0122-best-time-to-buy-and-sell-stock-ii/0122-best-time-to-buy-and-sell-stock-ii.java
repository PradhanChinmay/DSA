class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length <= 1) return 0;
        
        int buy_day = -1, sell_day = -1;
        int max_prof = 0;
        
        for (int i = 0; i <= prices.length - 1; i++) {
            
            if (i == 0 && prices[i] <= prices[i + 1]) {
                
                buy_day = i;
                
            }
            
            if (i == prices.length - 1 && prices[i] >= prices[i - 1]) {
                max_prof = max_prof + (prices[i] - prices[buy_day]);
            }
            
            
            if (i != 0 && i != prices.length - 1 && prices[i] <= prices[i + 1] && prices[i] <= prices[i - 1]) {
                buy_day = i;
            }
            
            if (i != 0 && i != prices.length - 1 && prices[i] >= prices[i + 1] && prices[i] > prices[i - 1]) {
                
                max_prof = max_prof + (prices[i] - prices[buy_day]);
                buy_day = -1;
                
            }
            
        }
        
        return max_prof;
        
    }
}