package com.DSA;

import java.util.*;
public class FirstOccurance {
	public static int firstIndex(int []arr,int index,int element)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==element)
		{
			return index;
		}
		return firstIndex(arr,index+1,element);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element=sc.nextInt();
		System.out.println("The First occurance index of the element is : "+firstIndex(arr,0,element));

	}

}
