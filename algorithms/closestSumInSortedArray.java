package helloWorld;

public class closestSumInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 22, 28, 29, 30, 40};
		int sum = 54;
		int[] result = closestSum(arr,sum);
		System.out.println(result[0]+ " " + result[1]);
	}
	
	public static int[] closestSum(int[] arr, int sum)
	{
		int l = 0;
		int[] result = new int[2];
		int r = arr.length - 1;
		int diff = 9999;
		while(l<r)
		{
			if(Math.abs((arr[l]+arr[r]-sum))<=diff)
			{
				diff = Math.abs((arr[l]+arr[r]-sum));
				result[0] = arr[l];
				result[1] = arr[r];
			}
			if(arr[l]+arr[r]<sum)
				l = l+1;
			else
				r = r-1;
		}
		return result;
	}
}
