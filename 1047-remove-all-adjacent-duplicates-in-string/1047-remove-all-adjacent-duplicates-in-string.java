class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st=new Stack<>();
        
        st.push(s.charAt(0));

            for(int i=1;i<s.length();i++)
            {
                if(!st.isEmpty() && st.peek()==s.charAt(i))
                {
                    st.pop();
                    s=s.substring(0,i-1)+s.substring(i+1);
                    i=i-2;
                }
                else
                    st.push(s.charAt(i));
            }
        
        return s;

        
    }
}