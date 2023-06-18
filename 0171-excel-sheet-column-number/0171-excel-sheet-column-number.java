class Solution {
    public int titleToNumber(String columnTitle) {
        
        int n = columnTitle.length() - 1;
        int res = 0;
        
        for (int i = 0; i <= columnTitle.length() - 1; i++) {
            res  = res + (int)Math.pow(26, n - i) * (int)(columnTitle.charAt(i) - 'A' + 1);
        }
        
        return res;
        
    }
}