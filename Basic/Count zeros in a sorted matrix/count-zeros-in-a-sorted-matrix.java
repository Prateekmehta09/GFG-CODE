//{ Driver Code Starts
import java.util.*;



class Count_0_In_Sorted_Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<n; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new GfG().countZeros(arr, n));
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    /*you are required to complete this method*/
    int countZeros(int arr[][], int N)
    {
        // Your code here
        int row=0;
        int col=N-1;
        int ans=0;
        
        while(row<N && col>=0)
        {
            if(arr[row][col]==0)
            {
                ans=ans+col+1;
                row++;
            }
            else{
                col--;
            }
        }
        return ans;
    }
}