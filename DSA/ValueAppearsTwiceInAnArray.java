package com.DSA;

public class ValueAppearsTwiceInAnArray {

	public static void main(String[] args) {
		int []arr= {1,2,3};
		boolean res=isValueAppearsTwice(arr);
		System.out.println(res);
		}
	public static boolean isValueAppearsTwice(int[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					return true;
				}
			}
		}
		return false;
		
	}
	

}