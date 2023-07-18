class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length <= 0) return 0;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for (int k : nums) hs.add(k);
        
        int ans = 1;
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            if (!hs.contains(nums[i] - 1)) {
                
                int count = 0;
                int j = nums[i];
                while (hs.contains(j)) {
                    count++;
                    j = j + 1;
                }
                
                ans = Math.max(ans, count);
                
            }
            
        }
        
        return ans;
        
    }
}