class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            
            while (!st.isEmpty() && st.peek() < nums2[i]) st.pop();
            
            if (st.isEmpty()) {
                
                temp.add(0, -1);
                
            }
            else {
                temp.add(0, st.peek());
            }
            
            st.push(nums2[i]);
            
        }
        
        int[] ans = new int[nums1.length];
        
        int[] ind = new int[nums1.length];
        
        for (int i = 0; i <= nums1.length-1; i++) {
            
            for (int j = 0; j <= nums2.length - 1; j++) {
                
                if (nums1[i] == nums2[j]) {
                    ind[i] = j;
                    break;
                }
                
            }
            
        }
        
        for (int i = 0; i <= ind.length - 1; i++) {
            
            ans[i] = temp.get(ind[i]);
            
        }
        
        return ans;
        
    }
}