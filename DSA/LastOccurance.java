package com.DSA;

import java.util.*;
public class LastOccurance {
	public static int lastIndex(int []arr,int index,int element)
	{
		if(index==arr.length)
			return -1;
		
		int l=lastIndex(arr,index+1,element);
		if(l==-1) 
		{
			if(arr[index]==element)
			{
				return index;
			} else {
				return -1;
			}}
			else {
				return l;
			}
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
		System.out.println("The last occurance index of the element : "+lastIndex(arr,0,element));
	}

}
