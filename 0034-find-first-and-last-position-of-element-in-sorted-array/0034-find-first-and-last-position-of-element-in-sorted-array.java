class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        ans[0] = find_first_index(nums, target);
        ans[1] = find_last_index(nums, target);
        
        return ans;
        
    }
    
    public static int find_first_index (int[] nums, int target) {
        
        int l = 0, r = nums.length - 1;
        
        while (l <= r) {
            
            int mid = l + (r - l) / 2;
            
            if ((nums[mid] == target && mid == 0) || (nums[mid] == target && nums[mid - 1] != target)){
                return mid;
            }
            else if (nums[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
            
        }
        
        return -1;
        
    }
    
    public static int find_last_index (int[] nums, int target) {
        
        int l = 0, r = nums.length - 1;
        
        while (l <= r) {
            
            int mid = l + (r - l) / 2;
            
            if ((nums[mid] == target && mid == nums.length - 1) || (nums[mid] == target && nums[mid + 1] != target)){
                return mid;
            }
            else if (nums[mid] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
            
        }
        
        return -1;
        
    }
    
    
}