class Solution {
    public String longestPalindrome(String s) {
        
        int max = 1;
        
        int st = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            
            int len = Math.max (len1, len2);
            
            if (len >= max) {
                
                max = len;
                
                end = i + (len / 2) + 1;
                st = i - ((len - 1) / 2);
                
            }
            
        }
        
        return s.substring(st, end);
        
    }
    
    public static int expandFromMiddle(String s, int start, int end) {
        
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            
            start--;
            end++;
            
        }
        
        return end - start - 1;
        
    }
}