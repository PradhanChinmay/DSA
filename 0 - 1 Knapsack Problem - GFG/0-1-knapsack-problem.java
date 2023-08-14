//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        return solve_tab(wt, val, n, W);
    } 
    
    // static int solve (int[] wt, int[] val, int ind, int capacity) {
        
    //     if (ind == 0) {
    //         if (wt[0] <= capacity) {
    //             return val[0];
    //         }
    //         else {
    //             return 0;
    //         }
    //     }
        
    //     int include = 0;
    //     if (wt[ind] <= capacity) {
    //         include = val[ind] + solve(wt, val, ind - 1, capacity-wt[ind]);
    //     }
        
    //     int exclude = 0 + solve(wt, val, ind - 1, capacity);
        
    //     return Math.max(include, exclude);
        
    // }
    
    // static int solve_mem (int[] wt, int[] val, int ind, int capacity, int[][] dp) {
        
    //     if (ind == 0) {
    //         if (wt[0] <= capacity) {
    //             return val[0];
    //         }
    //         else {
    //             return 0;
    //         }
    //     }
        
    //     if (dp[ind][capacity] != -1) return dp[ind][capacity];
        
    //     int include = 0;
    //     if (wt[ind] <= capacity) {
    //         include = val[ind] + solve_mem(wt, val, ind - 1, capacity-wt[ind], dp);
    //     }
        
    //     int exclude = 0 + solve_mem(wt, val, ind - 1, capacity, dp);
        
    //     return dp[ind][capacity] = Math.max(include, exclude);
        
    // }
    
    static int solve_tab(int[] wt, int[] val, int n, int cap) {
        
        int[][] dp = new int[n][cap + 1];
        
        for (int w = wt[0]; w <= cap; w++) {
            
            if (wt[0] <= cap) {
                dp[0][w] = val[0];
            }
            else {
                dp[0][w] = 0;
            }
            
        }
        
        for (int i = 1; i < n; i++) {
            
            for (int w = 0; w <= cap; w++) {
                
                int include = 0;
                if (wt[i] <= w) {
                    include = val[i] + dp[i - 1][w - wt[i]];
                }
                
                int exclude = 0 + dp[i - 1][w];
                
                dp[i][w] = Math.max(include, exclude);
                
            }
            
        }
        
        return dp[n - 1][cap];
        
    }
}


