package com.rm.sum;

import java.util.ArrayList;
import java.util.List;

public class FindSumOfGivenNum {

	public static void main(String[] args) {
		int[] ar = { 3, 6, 8, -8, 10, 8 };
		int num = 16;
		List<Integer> sum = findSum(ar, num);
		
		for (Integer integer : sum) {
			
			System.out.println(integer);
		}
		
	}

	public static List<Integer> findSum(int[] ar, int num) {
		int sum=0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				sum=ar[i]+ar[j];
				if(sum==num) {
					list.add(ar[i]);
					list.add(ar[j]);
				}					
			}
		}
		return list;
	}
}
