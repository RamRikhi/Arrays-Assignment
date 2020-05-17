package com.rm.minSumPair;

import java.util.Arrays;

public class MinSumPair {
	public static int[] findThirdLargest(int[] ar) {
		int len=ar.length;
		int temp=0;
		int[] pair=new int[len];
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		pair[0]=ar[0];
		pair[1]=ar[1];
		
		return pair;
	}
	public static void main(String[] args) {
		
		int ar[]={1, 7, 10,5, 9, 6};
		System.out.println(Arrays.toString(ar));
		int[] num=findThirdLargest(ar);
		System.out.println("The pair ("+num[0]+","+num[1]+") will have the minimum sum pair i.e. "+num[0]+"+"+num[1]+"="+(num[0]+num[1]));
	}

}
