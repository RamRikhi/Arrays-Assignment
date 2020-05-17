package com.rm.unique;

import java.util.Arrays;

public class SumOfUnique {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println(Arrays.toString(arr));
		int sum=sumOfUnique(arr);
		
		System.out.println("Sum of unique elements is :"+sum);
	}

	public static int sumOfUnique(int[] arr) {
		int len=arr.length;
		int sum=0;
		for (int i = 0; i <len; i++) {
			for (int j = i+1; j < len; j++) {
			   if(arr[i] == arr[j]) {
					arr[i]=0;
				}
			}	
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0 || 0<arr[0]) {
				sum+=arr[i];
			}
		}
		return sum;
	}
}
