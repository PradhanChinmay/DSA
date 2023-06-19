class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
        
        int c[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int n1=s.charAt(i)-'a';
            int n2=t.charAt(i)-'a';
            c[n1]++;
            c[n2]--;
        }
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=0)
                return false;
        }
        return true;

        
    }
}