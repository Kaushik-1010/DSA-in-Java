package com.DSA;

import java.util.*;
public class SearchIndexPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr= {1,3,2,9,8};
		int ele=sc.nextInt();
		int res= searchIndexOf(arr,ele);
		System.out.println(res);
		
	}

	private static int searchIndexOf(int[] arr, int ele) {
		int start=0;
		int end=arr.length;
		while(start<end)
		{
			int mid= start+(end-start)/2;
			if(arr[mid]==ele)
			{
				return mid;
			}
			else if(arr[mid]>ele)
				return end-1;
			else
				return start+1;
		}
		return start;
	}
	 // Time complecity is   O(nlogn)
				
			}