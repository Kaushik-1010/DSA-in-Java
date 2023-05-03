package com.DSA;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr={20,10,15,7,30,25};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		
		
	}

}
