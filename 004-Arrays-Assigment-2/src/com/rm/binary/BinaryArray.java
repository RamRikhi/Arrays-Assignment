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
		int[] temp=new int[input.length];
		int[] temp2=new int[input.length];
		int size=0,size2=0;
		int count=0;
		for (int i = 0; i < input.length; i++) {
			if(0==input[i]) {
				temp[size++]=input[i];
				count++;
			}else if(1==input[i]) {
				temp2[size2++]=input[i];
			}
		}
		for (int i = 0; i < input.length; i++) {
			input[i]=temp[i];
		}
		size=0;
		for (int i = count; i < input.length; i++) {
			input[i]=temp2[size++];
		}
		return input;
	}
}
