class Solution {
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            nums[nums[i] % n] = nums[nums[i] % n] + n;
            
        }
        
        int ans = -1;
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            if (nums[i] > 2 * n) {
                ans = i;
                break;
            }
            
        }
        
        return ans;
        
    }
}