package com.rm.maxMin;

public class MaxMinElement {

	public static void main(String[] args) {
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int max=findMax(ar1);
		int min=findMin(ar1);
		System.out.println("Largest number is :"+max);
		System.out.println("Smallest number is :"+min);
	}

	public static int findMin(int[] ar1) {
		int min=ar1[0];
		for (int i = 0; i < ar1.length; i++) {
			if(ar1[i]<min)
				min=ar1[i];
		}
		return min;
	}

	public static int findMax(int[] ar1) {
		int max=ar1[0];
		for (int i = 0; i < ar1.length; i++) {
			if(ar1[i]>max)
				max=ar1[i];
		}
		return max;
	}

}
