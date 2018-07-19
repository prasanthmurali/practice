package algorithms;

/*
 * Given an array of 1s and 0s which has all 1s first followed by all 0s. Find the number of 0s. Count the number of zeroes in the given array.

Examples :

Input: arr[] = {1, 1, 1, 1, 0, 0}
Output: 2

Input: arr[] = {1, 0, 0, 0, 0}
Output: 4

Input: arr[] = {0, 0, 0}
Output: 3

Input: arr[] = {1, 1, 1, 1}
Output: 0
Ref: https://www.geeksforgeeks.org/find-number-zeroes/
 */
public class noOfZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 1, 1, 1, 0, 0};
		int arr2[] = {1, 0, 0, 0, 0};
		int arr3[] = {0, 0, 0};
		int arr4[] = {1, 1, 1, 1};
		
		int n = arr2.length;
		
		int firstZero = findFirstZero(arr2,0,n-1);
		if(firstZero ==-1)
			System.out.println(0);
		else
			System.out.println(n-firstZero);
	}

	private static int findFirstZero(int[] arr, int i, int j) {
		int high = j, low = i;
        if (high >= low) 
        {
            // Check if mid element is first 0
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0)
                return mid;
 
            if (arr[mid] == 1) // If mid element is not 0
                return findFirstZero(arr, (mid + 1), high);
            else // If mid element is 0, but not first 0
                return findFirstZero(arr, low, (mid - 1));
        }
        return -1;
	}
}
