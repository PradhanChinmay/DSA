class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i <= s.length() - 1; i++) {
            
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            
        }
        
        for (int i = 0; i <= s.length() - 1; i++) {
            
            if (map.get(s.charAt(i)) == 1) return i;
            
        }
        
        
        return -1;
        
    }
}