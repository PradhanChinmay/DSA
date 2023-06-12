//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
       public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String str = sc.nextLine();
            Solution ob = new Solution();
            if(ob.sentencePalindrome(str))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    } 
} 
// } Driver Code Ends


class Solution { 

    static boolean sentencePalindrome(String str) {
        
        String new_str = "";
        
        int i = 0;
        
        while (i < str.length()) {
            
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) new_str = new_str + str.charAt(i);
            i++;
            
        }
        
        return helper (new_str);
        
    }
    
    public static boolean helper (String str) {
        
        int l = 0, r = str.length() - 1;
        
        while (l < r) {
            
            if (str.charAt(l) != str.charAt(r)) return false;
            
            l++;
            r--;
            
        }
        
        return true;
        
    }
}