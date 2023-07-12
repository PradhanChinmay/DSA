class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer> > ans = new ArrayList<>();
        
        List<Integer> sub = new ArrayList<>();
        
        helper(nums, 0, sub, ans);
        
        return ans;
        
    }
    
    public void helper (int[] nums, int i, List<Integer> sub, List<List<Integer> > ans) {
        
        if (i == nums.length) {
            
            ans.add(new ArrayList<>(sub));
            return;
            
        } 
        
        sub.add(nums[i]);
        helper(nums, i + 1, sub, ans);
        
        sub.remove(sub.size() - 1);
        helper(nums, i + 1, sub, ans);
        
        return;
        
    }
}