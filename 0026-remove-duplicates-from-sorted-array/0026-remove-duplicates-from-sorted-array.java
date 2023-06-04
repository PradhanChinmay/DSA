class Solution {
    public int removeDuplicates(int[] nums) {

        int l = 0, r = 0;

        while (r < nums.length) {

            if (nums[l] != nums[r]) {
                l++;
                nums[l] = nums[r];
            }

            r++;

        }

        l = l + 1;
        
        return l;
        
    }
}