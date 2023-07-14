class Solution {
    public boolean checkRecord(String s){
        int ab=0, l=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='P')
            {
                l=0;
            }
            else if(s.charAt(i)=='A')
            {
                ab++;
                l=0;
                if(ab>=2)
                    return false;
            }
            else if(s.charAt(i)=='L')
            {
                l++;
                if(l>=3)
                    return false;
            }
        }
return true;}
}