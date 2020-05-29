package com.rm.leader;

import java.util.Arrays;

public class LeaderNumber {
	public static void main(String[] args) {
		int[] input = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		System.out.print("Elements are :");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		System.out.println();
		int[] leader=LeaderNumber.getLeaderElement(input);
		System.out.println(Arrays.toString(leader));

	}

	public static int[] getLeaderElement(int[] input) {
		int[] temp=new int[input.length];
		int temp2=0,temp3=0,count=0,size=0;
		//System.out.println(temp.length);
		//System.out.println(input.length);
		for (int i = 0; i < input.length; i++) {
			temp2=input[i];
			for (int j = 0; j < input.length; j++) {
				if(i!=j) {
					temp3=input[j];
					if(temp2==temp3) {
						++count;
					}	
				}
				System.out.println(count);
			}
		}
		return temp;
	}
}
