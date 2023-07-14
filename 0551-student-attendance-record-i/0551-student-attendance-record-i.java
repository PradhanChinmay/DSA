class Solution {
    public boolean checkRecord(String s) {
        
        int c = 0;
        
        if (s.contains("LLL")) return false;
        
        for (int i = 0; i <= s.length() - 1; i++) {
            
            if (s.charAt(i) == 'A') c++;
            
        }
        
        if (c >= 2) return false;
        
        return true;
        
    }
}