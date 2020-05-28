package com.rm.exceptSameIndex;

import java.util.Arrays;

public class ExceptSameIndex {
		public static void main(String[] args) {
			int[] input = {10,20,30,40,50};
			System.out.println("Before adding:"+Arrays.toString(input));
			input=ExceptSameIndex.getSumExceptCurrentIndex(input);
			System.out.println("After adding:"+Arrays.toString(input));
		}

		public static int[] getSumExceptCurrentIndex(int[] input) {
			int[] temp=new int[input.length];
			int size=0,sum=0;
			//here adding except current index elements
			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < input.length; j++) {
					if(i!=j) {
						sum=sum+input[j];
					}
				}
				temp[size++]=sum;
				sum=0;
			}
			//here copying one array to another array
			for (int i = 0; i < input.length; i++) {
				input[i]=temp[i];
			}
			return input;
		}
}
