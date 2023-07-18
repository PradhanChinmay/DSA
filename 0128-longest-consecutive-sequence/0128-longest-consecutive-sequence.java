class Solution {
    public int longestConsecutive(int[] nums) {
        
       HashSet<Integer> set = new HashSet<>();
	   int maxLen = 0;
        
       int n = nums.length;
	   
	   for (int i = 0; i < n; i++) {
	       set.add(nums[i]);
	   }
	   
	   for (int i = 0; i < n; i++){
	       if (!set.contains(nums[i] - 1)){
	           int j = nums[i], length = 0;
	           
	           while (set.contains(j)){
	               j++;
	               length++;
	           }
	           
	           if (maxLen < length)
	                maxLen = length;
	       }

	   }
	   
	   return maxLen;
        
    }
}