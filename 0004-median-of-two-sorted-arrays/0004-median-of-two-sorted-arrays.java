class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length) {
            
            return findMedianSortedArrays(nums2, nums1);
            
        }
        
        int n = nums1.length, m = nums2.length;
        
        int l = 0, h = n;
        
        while (l <= h) {
            
            int partA = (l + h) / 2;
            
            int partB = (n + m + 1) / 2 - partA;
            
            int maxLeftA = partA == 0 ? Integer.MIN_VALUE : nums1[partA - 1];
            int minRightA = partA == n ? Integer.MAX_VALUE : nums1[partA];
            
            int maxLeftB = partB == 0 ? Integer.MIN_VALUE : nums2[partB - 1];
            int minRightB = partB == m ? Integer.MAX_VALUE : nums2[partB];
            
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                
                if ((n + m) % 2 == 0) {
                    return ((double) Math.max(maxLeftA, maxLeftB) +                 Math.min(minRightA,minRightB))/2;
                }
                else {
                    return ((double) Math.max(maxLeftA, maxLeftB));
                }
                
            }
            else if (maxLeftA > minRightB) {
                h = partA - 1;
            }
            else {
                l = partA + 1;
            }
            
        }
        
        return -1;
        
    }
}