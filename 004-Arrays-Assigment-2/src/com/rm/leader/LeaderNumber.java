package com.rm.leader;

import java.util.Arrays;
import java.util.List;

public class LeaderNumber {
	public static void main(String[] args) {
		int[] input = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		System.out.print("Elements are :");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
		int[] leader=LeaderNumber.getLeaderElement(input);
		System.out.println(Arrays.toString(leader));

	}

	public static int[] getLeaderElement(int[] input) {
		int len = input.length;
		int temp=0;
		int[] arr =new int[100];
		len=len/2;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]==input[j]) {
					arr[count++]=input[i];
				}
			}
		}
		return arr;
	}
}
