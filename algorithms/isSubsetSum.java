package helloWorld;

public class isSubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,34,4,12,5,2};
		int n=arr.length;
		int sum=1;
		System.out.println(isSubsetSum(arr,n,sum));
	}
	
	public static boolean isSubsetSum(int[] arr, int n, int sum)
	{
		if(sum==0)
			return true;
		else if(sum!=0 && n==0)
			return false;
		else
			return(isSubsetSum(arr,n-1,sum-arr[n-1])||isSubsetSum(arr,n-1,sum));
	}
}
