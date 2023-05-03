package com.DSA;

public class InsertionSort {
	 static void insertionSort(int arr[])
	    {
	        int len = arr.length; //calculating the length of the array
	        for (int i = 1; i < len; i++) 
	        { 
	            int key = arr[i]; 
	            int j = i - 1; 

	            /* Shift elements of a[i-1 .... 0], that are greater 
	            than key, to one position right of their 
	            current position */ 
	            while (j >= 0 && arr[j] > key)
	            {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }
	public static void main(String[] args) {
		int []arr= {8,6,12,1,3,2};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
