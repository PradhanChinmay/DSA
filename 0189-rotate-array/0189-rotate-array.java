class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
    }
    
    public void reverse (int[] arr, int i, int j) {
        
        int l = i, r = j;
        
        while (l < r) {
            
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            
            l++;
            r--;
            
        }
        
    }
}