class Solution {
    public void sortColors(int[] nums) {
        
        int count_0 = 0, count_1 = 0;
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            if (nums[i] == 0) count_0++;
            if (nums[i] == 1) count_1++;
            
        }
        
        int i = 0;
        
        while (i <= nums.length - 1) {
            
            if (count_0 > 0) {
                nums[i++] = 0;
                count_0--;
            }
            else if (count_1 > 0) {
                nums[i++] = 1;
                count_1--;
            }
            else {
                nums[i++] = 2;
            }
            
        }
        
    }
}