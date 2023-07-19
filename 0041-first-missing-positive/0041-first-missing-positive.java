class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        int max = Integer.MIN_VALUE;
        
        for (int k : nums) {
            
            max = Math.max(k, max);
            hs.add(k);
            
        }
        
        System.out.println(hs);
        System.out.println(max);
        
        int i = 1;
        while (i <= max) {
            
            if (!hs.contains(i)) return i;
            i++;
            
        }
        
        return i;
        
        
    }
}