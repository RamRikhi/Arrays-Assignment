package com.rm.zerosAndOnes;

import java.util.Arrays;

public class SegregationZerosAndOnes {
	public static void main(String[] args) {
		int[] input = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		//printing the element before segregating an array
		System.out.println("Before segregate=="+Arrays.toString(input));
		//here method call 
		input=segregateZerosAndOnes(input);
		//printing the element array segregating an array
		System.out.println("After segregate=="+Arrays.toString(input));
	}

	//segregating method
	public static int[] segregateZerosAndOnes(int[] input) {
	
		int[] temp = new int[input.length];
		int count=0,size=0;
		//counting the 1s element of a given array
		for (int i = 0; i < input.length; i++) {
			if(1==input[i])
				count++;
		}
		//here segregating the 0s in left side and 1s right side
		for (int i = 0; i < input.length; i++) {
			if(0==input[i]) {
				temp[size++]=input[i];
			}
			if(1==input[i]) {
				temp[count++]=input[i];
			}
		}
		//here copying the temp array to original array
		for (int i = 0; i < input.length; i++) {
			input[i]=temp[i];
		}
		return input;
	}
}
