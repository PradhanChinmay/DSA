class Solution {
    public int maxSubArray(int[] nums) {
        
        int max_sum = Integer.MIN_VALUE, curr_sum = 0;
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            curr_sum = curr_sum + nums[i];
            
            max_sum = Math.max(max_sum, curr_sum);
            
            if (curr_sum < 0) curr_sum =  0;
            
        }
        
        return max_sum;
        
    }
}