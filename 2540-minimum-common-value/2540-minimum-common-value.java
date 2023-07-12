class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs1 = new HashSet<>();
        
        for (int i : nums1) hs1.add(i);
        
        HashSet<Integer> hs2 = new HashSet<>();
        
        for (int j : nums2) {
            if (hs1.contains(j)) hs2.add(j);
        }
        
        if (hs2.isEmpty()) return -1;
        
        int min = Integer.MAX_VALUE;
        
        for (int k : hs2) if (k < min) min = k;
        
        return min;
        
    }
}