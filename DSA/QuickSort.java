package com.DSA;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {30,10,45,25,60,50};
		int n=arr.length;
		quickSort(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	public static void quickSort(int[] arr, int low, int high) {
		if(low<high)
		{
			int indexPi=partition(arr,low,high);
			quickSort(arr,low,indexPi-1);
			quickSort(arr,indexPi+1,high);
			
		}
		
		
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot=arr[high];
		int swapIndex=low-1;
		for(int i=low;i<high;i++)
		{
			if(arr[i]<pivot)
			{
				swapIndex++;
				int temp=arr[swapIndex];
				arr[swapIndex]=arr[i];
				arr[i]=temp;
			}
		}
		int temp=arr[swapIndex+1];
		arr[swapIndex+1]=arr[high];
		arr[high]=temp;
		
		return swapIndex+1;
		
		
	}

}
