package helloWorld;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,0,97,6,43,1,56,95,2};
		int l =0;
		int r = arr.length-1;
		mergeSort(arr,l,r);
		printArray(arr);

	}

	private static void mergeSort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r)
		{
			int m = (l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		// TODO Auto-generated method stub
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] lArr = new int[n1];
		int[] rArr = new int[n2];
		
//	    for (int i = 0; i < n1; i++)
//	        lArr[i] = arr[l + i];
//	    for (int j = 0; j < n2; j++)
//	        rArr[j] = arr[m + 1+ j];
		lArr = copyArray(arr,l,n1);
		rArr = copyArray(arr,m+1,n2);
		
        for (int i=0; i<n1; ++i)
            lArr[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
    			rArr[j] = arr[m + 1+ j];
//		
		int k = l;
		l = 0;
		r = 0;
		
		while(l<n1 && r<n2)
		{
			if(lArr[l]<=rArr[r])
			{
				arr[k] = lArr[l];
				l++;
			}
			else
			{
				arr[k] = rArr[r];
				r++;
			}
			k++;
		}
		
		while(l<n1)
		{
			arr[k] = lArr[l];
			l++;
			k++;
		}
		while(r<n2)
		{
			arr[k] = rArr[r];
			r++;
			k++;
		}


	}

	private static int[] copyArray(int[] arr, int l, int n) {
		// TODO Auto-generated method stub
		int copyArr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			copyArr[i] = arr[l+i];
		}
		return copyArr;
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

}
