class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i <= nums.length - 1; i++) set.add(nums[i]);
        
        return set.size() != nums.length;
        
    }
}