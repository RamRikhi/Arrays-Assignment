package com.rm.third;

import java.util.Arrays;

public class ThirdLargest {
	
	public static int findThirdLargest(int[] ar) {
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
		return ar[len-3];
	}
	public static void main(String[] args) {
		
		int ar[]={ 6, 8, 1, 30,9, 2, 1, 10,50,60,4,8};
		System.out.println(Arrays.toString(ar));
		int largest=findThirdLargest(ar);
		System.out.println("Third Largest Number:"+largest);
	}

}
