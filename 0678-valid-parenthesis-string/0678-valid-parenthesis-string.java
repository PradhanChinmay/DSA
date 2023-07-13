class Solution {
    public boolean checkValidString(String s) {
        
        int open_count = 0, closed_count = 0, star = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') open_count++;
            if(s.charAt(i) == ')') closed_count++;
            if(s.charAt(i) == '*') star++;
            if(closed_count > open_count +star) return false;
        }
        
        open_count = 0;
        closed_count = 0;
        star = 0;
        
        for(int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '(') open_count ++;
            if(s.charAt(i) == ')') closed_count ++;
            if(s.charAt(i) == '*') star++;
            if(open_count > closed_count +star) return false;
        }
        
        return true;
        
    }
}