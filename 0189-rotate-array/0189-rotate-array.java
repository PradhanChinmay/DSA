class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        for(int i=0;i<nums.length/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp;
        }
        
        for(int i=0;i<k/2;i++)
        {
            int temp=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=temp;
        }
        
        rev_from_k(nums,k,nums.length-1);
        
    }
    
    public void rev_from_k(int arr[], int i, int j)
    {
        while (i < j) {
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
            
        }
    }
    
}