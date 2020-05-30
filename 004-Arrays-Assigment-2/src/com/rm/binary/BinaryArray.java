package com.rm.binary;

import java.util.Arrays;

public class BinaryArray {
	public static void main(String[] args) {
		int[] input = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		System.out.println(Arrays.toString(input));
		input=binary(input);
		System.out.println(Arrays.toString(input));
	}

	public static int[] binary(int[] input) {
	
		int temp=input[0];
		int temp2=0;
		for (int i = 1; i < input.length; i++) {
			if(temp<=input[i]) {
				temp2=temp;
				temp=input[i];
				input[i]=temp2;
				
			}
		}
		return input;
	}
}
