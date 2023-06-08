class Solution {
    public int mySqrt(int x) {
        
        long l=0;
        long h=x;
        
        long res=0;
        
        while(l<=h)
        {
            long mid=l+(h-l)/2;
            if(mid*mid<=x)
            {
                res=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return (int)res;


        
    }
}