package com.rm.binary;

import java.util.Arrays;

public class BinaryArray {
	public static void main(String[] args) {
		int[] input = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		System.out.println(Arrays.toString(input));
		input=binarySort(input);
		System.out.println(Arrays.toString(input));
	}

	public static int[] binarySort(int[] input) {
	
		int temp=input[0];
		
		for (int i = 1; i < input.length-1; i++) {
			if(input[i]>=input[i+1]) {
				temp=input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
		}
		return input;
	}
}
