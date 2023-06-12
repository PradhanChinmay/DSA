class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        
        String new_str = "";
        
        int i = 0;
        
        while (i <= s.length() - 1) {
            
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57)) new_str = new_str + s.charAt(i);
            i++;
            
        }
        
        return helper(new_str);

        
    }
    
    public static boolean helper (String str) {
        
        int l = 0, r = str.length() - 1;
        
        while (l < r) {
            
            if (str.charAt(l) != str.charAt(r)) return false;
            
            l++;
            r--;
            
        }
        
        return true;
        
    }
}

