class Solution {
    public void moveZeroes(int[] nums) {
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            if (nums[i] != 0) {
                
                int r = i;
                
                while (r > 0 && nums[r - 1] == 0) {
                    
                    nums[r - 1] = nums[r];
                    nums[r] = 0;
                    
                    r--;
                    
                }
                
            }
            
        }
        
    }
}