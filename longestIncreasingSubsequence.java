package helloWorld;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
         int n = arr.length;
         System.out.println("LIS length: " + LIS( arr, n ));
	}
	
	public static int LIS(int[] arr, int n)
	{
		int[] lis = new int[n];
		for(int i=0;i<n;i++)
			lis[i]=1;
		
		for(int i=0;i<n;i++)
			for(int j=0;j<i;j++)
				if(arr[i]>arr[j]&&lis[i]<lis[j]+1)
					lis[i] = lis[j]+1;
		
		return findMax(lis);
	}

	private static int findMax(int[] lis) {
		// TODO Auto-generated method stub
		int max;
		max = lis[0];
		for(int i=0;i<lis.length;i++)
			if(lis[i]>max)
				max=lis[i];
		return max;
	}
	
	

}
