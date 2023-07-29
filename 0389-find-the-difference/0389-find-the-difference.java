class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] arr = new int[26];
        
        for(int i = 0; i <= t.length() - 1; i++) arr[t.charAt(i) - 'a'] += 1;
        
        for(int i = 0; i <= s.length() - 1; i++) arr[s.charAt(i) - 'a'] -= 1;
        
        for (int i = 0; i <= 25; i++) if (arr[i] > 0) return (char)(i + 97);
        
        return ' ';
        
    }
}