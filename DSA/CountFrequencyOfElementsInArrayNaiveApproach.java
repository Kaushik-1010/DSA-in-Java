package com.DSA;

import java.util.*;
public class CountFrequencyOfElementsInArrayNaiveApproach {

	public static void main(String[] args) {
		int[] arr= {5,8,7,8,10};
		int n=arr.length;
		countFrequency(arr,n);
		}
	private static void countFrequency(int[] arr, int n) {
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false);

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {

		// Skip this element if already processed
		if (visited[i] == true)
		continue;

		// Count frequency
		int count = 1;
		for (int j = i + 1; j < n; j++) {
		if (arr[i] == arr[j]) {
		visited[j] = true;
		count++;
		}
		}
		System.out.println(arr[i] + " occurs " + count +" times ");
		}
		}
		
	}
		// O(n2) is the time complexity
