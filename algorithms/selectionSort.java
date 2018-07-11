package helloWorld;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,0,97,6,43,1,56,95,2};
		sort(arr);
	}

	private static void sort(int[] arr) {
		// performing selection sort
		
		int n = arr.length;
		for(int i =1;i<n;i++)
		{
			for(int j=i;j>0;j--)
			{
				if((arr[j]<arr[j-1]))
				{
					swap(arr,j);
				}
			}
		}
		
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println("Sorted Array :");
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

	private static void swap(int[] arr, int j) {
		
		int temp;
		temp = arr[j];
		arr[j] = arr[j-1];
		arr[j-1]=temp;
	}

}
