package com.rm.second;

import java.util.Arrays;

public class SecondLargest {
	public static int findSecondLargest(int[] ar) {
		int len=ar.length;
		int temp=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar[len-2];
	}
	
	public static int findSecondSmallest(int[] ar) {
		int len=ar.length;
		int temp=0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]<ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		return ar[len-2];
	}
	public static void main(String[] args) {
		
		int ar[]={ 1, 2, 5, 9, 6, 4, 7, 2};
		System.out.println(Arrays.toString(ar));
		int largest=findSecondLargest(ar);
		int smallest=findSecondSmallest(ar);
		System.out.println("Second Largest Number:"+largest);
		System.out.println("Second smallest Number:"+smallest);
	}
}
