class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int l = 0, r = 1;
        
        int count = 0;
        
        HashSet<List<Integer> > hs = new HashSet<>();
        
        while (r < nums.length){
            
            if (l == r && k == 0) {
                r++;
                continue;
            }
            
            if (nums[r] - nums[l] == k) {
                
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[l]);
                temp.add(nums[r]);
                
                if (!hs.contains(temp)) {
                    count++;
                    hs.add(temp);
                }
                
                r++;
                l++;
                
            }
            else if (nums[r] - nums[l] < k) {
                
                r++;
                
            }
            else {
                l++;
            }
            
        }
        
        return count;
        
    }
}