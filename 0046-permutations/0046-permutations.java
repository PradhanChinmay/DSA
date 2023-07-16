class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer> > ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        
        helper (nums, 0, sub, ans);
        
        return ans;
        
    }
    
    private static void helper (int[] nums, int i, List<Integer> sub, List<List<Integer>> ans) {
        
        if (i == nums.length) {
            
            ans.add(new ArrayList<>(sub));
            return;
            
        }
        
        for (int j = 0; j <= sub.size(); j++) {
            
            sub.add(j, nums[i]);
            helper (nums, i + 1, sub, ans);
            sub.remove(j);
            
            
        }
        
    }
}