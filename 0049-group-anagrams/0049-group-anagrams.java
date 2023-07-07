class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer, List<String>> map = new HashMap<>();
        
        for(int i = 0; i <= strs.length - 1; i++) {
            
            int hc = helper_hash(strs[i]);
            
            if (map.containsKey(hc)) {
                
                map.get(hc).add(strs[i]);
                
            }
            else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                
                map.put(hc, temp);
            }
            
        }
        
        List<List<String>> res = new ArrayList<>();
        
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            res.add(new ArrayList<>(entry.getValue()));
        }
        
        return res;
        
    }
    
    public static int helper_hash(String str) {
        
        int[] arr = new int[26];
        
        for (int i = 0; i <= str.length() - 1; i++) {
            
            int asc = (int)(str.charAt(i)) - (int)('a');
            
            arr[asc] = arr[asc] + 1;
            
        }
        
        return Arrays.hashCode(arr);
        
    }
}