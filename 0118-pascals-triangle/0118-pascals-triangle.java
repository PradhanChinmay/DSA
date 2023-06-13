class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer> > ans = new ArrayList<>();
        
        if (numRows == 0) return ans;
        
        List<Integer> sub = new ArrayList<>();
        sub.add(1);
        
        ans.add(new ArrayList<>(sub));
        
        if (numRows == 1) return ans;
        
        for (int i = 2; i <= numRows; i++) {
            
            List<Integer> temp = new ArrayList<>();
            
            for (int j = 0; j < i; j++) {
                
                int prev = j - 1 < 0 ? 0 : ans.get(i - 2).get(j - 1);
                int next = j >= ans.get(i - 2).size() ? 0 : ans.get(i - 2).get(j);
                
                temp.add(prev + next);
                
            }
            
            ans.add(new ArrayList<>(temp));
            
        }
        
        
        return ans;
        
    }
}