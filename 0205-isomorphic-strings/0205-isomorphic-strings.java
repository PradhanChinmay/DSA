class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Character> hm = new HashMap<>();
        
        for (int i = 0; i <= s.length() - 1; i++) {
            
            if (hm.containsKey(s.charAt(i))) {
                
                if (t.charAt(i) != hm.get(s.charAt(i))) return false;
                else continue;
                
            }
            else {
                
                if (hm.containsValue(t.charAt(i))) return false;
                
                hm.put(s.charAt(i), t.charAt(i));
            }
            
        }
        
        return true;
        
    }
}