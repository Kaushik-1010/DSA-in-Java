package com.DSA;

public class TheElementOccuringMostNumberOfTimes {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int count = 1;
        int tempCount;
        int popular = arr[0];
        int temp = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            temp = arr[i];
            tempCount = 0;
            for (int j = 1; j < arr.length; j++) {
                if (temp == arr[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        if (count > arr.length / 2) {
            System.out.println(popular);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
