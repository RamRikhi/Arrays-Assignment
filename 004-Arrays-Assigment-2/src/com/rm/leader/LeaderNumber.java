package com.rm.leader;

import java.util.List;

public class LeaderNumber {
	public static void main(String[] args) {
		int[] input = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		System.out.print("Elements are :");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		List<?> leader=LeaderNumber.getLeaderElement(input);
		
	}

	public static List<?> getLeaderElement(int[] input) {
		int len = input.length;
		len=len/2;
		return null;
	}
}
