class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int sum = 0, res = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int i = 0; i <= nums.length - 1; i++) {
            
            sum = sum + nums[i];
            
            int rem = sum % k;
            
            if (rem < 0) {
                rem = rem + k;
            }
            
            if (map.containsKey(rem)) {
                res = map.get(rem) + res;
                map.put(rem, map.get(rem) + 1);
            }
            else {
                map.put(rem, 1);
            }
            
        }
        
        return res;
        
    }
}