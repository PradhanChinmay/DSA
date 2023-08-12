class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        
        int m = t1.length(), n = t2.length();
        
        int[][] dp = new int[n + 1][m + 1];
        
        for (int i = 0; i <= m; i++) dp[0][m] = 0;
        
        for (int i = 0; i <= n; i++) dp[n][0] = 0;
        
        for (int i = 1; i <= n; i++) {
            
            char ch = t2.charAt(i - 1);
            
            for (int j = 1; j <= m; j++) {
                
                char x = t1.charAt(j - 1);
                
                if (ch == x) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                
            }
            
        }
        
        return dp[n][m];


        
    }
}