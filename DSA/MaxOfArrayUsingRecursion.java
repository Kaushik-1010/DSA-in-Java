package com.DSA;

import java.util.*;
public class MaxOfArrayUsingRecursion {
	public static int maxArray(int []arr,int i)
	{
		if(i==arr.length)
		{
			return 0;
		}
		int max=maxArray(arr,i+1);
		if(max<arr[i])
		{
			max=arr[i];
		}
		return max;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The maximum element of the array : "+maxArray(arr,0));
		

	}

}
