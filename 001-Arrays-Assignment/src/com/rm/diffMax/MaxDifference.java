package com.rm.diffMax;

public class MaxDifference {
	public static int findMaxDiff(int[] arr) {
		int maxDiff=arr[1]-arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] - arr[i] > maxDiff) 
                    maxDiff = arr[j] - arr[i];
			}
		}
		return maxDiff;
	}
	
	public static void main(String[] args) {
		int input[] = { 2, 5, 1, 7, 3, 9, 5,20};
		int diff=findMaxDiff(input);
		System.out.println("Max difference:"+diff);
	}
}
