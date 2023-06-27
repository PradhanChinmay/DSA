class Solution {
    public boolean isPowerOfThree(int n) {
        
        if (n <= 0) return false;
        
        if (n == 1) return true;
        
        int l = 1, r = n;
        
        while (l <= r) {
            
            int mid = l + (r - l) / 3;
            
            if (Math.pow(3, mid) == n) {
                return true;
            }
            else if (Math.pow(3, mid) > n) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
            
        }
        
        return false;
        
    }
}