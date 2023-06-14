class Solution {
    public void rotate(int[][] m) {
        
        int k=m.length;
        for(int i=0;i<k/2;i++)
        {
            for(int j=i;j<k-i-1;j++)
            {
                int d=m[i][j];
                m[i][j]=m[k-j-1][i];
                m[k-j-1][i]=m[k-i-1][k-j-1];
                m[k-i-1][k-j-1]=m[j][k-i-1];
                m[j][k-i-1]=d;
            }
        }
        
        
    }
}