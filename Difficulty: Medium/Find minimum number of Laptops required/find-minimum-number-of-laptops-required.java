//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        // code here
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        
        for(int i:start)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
         for(int i:end)
        {
            mp.put(i,mp.getOrDefault(i,0)-1);
        }
        
        int ans=1;
        int sum=0;
        for(int el :mp.keySet())
        {
            sum+=mp.get(el);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
    
}