package com.DSA;

import java.util.*;
public class RecursivePattern1 {
	public static void printPattern(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n+"");
		printPattern(n-1);
		System.out.print(n+"");
		printPattern(n-1);
		System.out.print(n+"");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPattern(n);

	}

}
//input= 2

// output: 211121112
