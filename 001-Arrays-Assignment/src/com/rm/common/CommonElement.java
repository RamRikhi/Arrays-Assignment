package com.rm.common;

import java.util.Arrays;

public class CommonElement {
	public static int[] commonElements(int ar1[],int ar2[],int ar3[]){
		int temp=0;
		int ar4[]=new int[10];
		for (int i=0;i<ar1.length;i++) {
			for (int j=0;j<ar2.length;j++) {
				for (int k=0;k<ar3.length;k++) {
					if (ar1[i]==ar2[j]) {
						temp=ar1[i];
						if (temp==ar3[k]) {
							ar4[i]=ar1[i];
						}
					}
				}
			}
		}
		return ar4;
	}
	
	public static void main(String[] args) {
		int ar1[] = {1, 5, 45,10, 20, 40, 80};
		int ar2[] = {45,6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120,45};
		int[] list=commonElements(ar1, ar2, ar3);
		System.out.println("First Arrays:"+Arrays.toString(ar1));
		System.out.println("Second Arrays:"+Arrays.toString(ar2));
		System.out.println("Third Arrays:"+Arrays.toString(ar3));
		System.out.println("Common Arrays:"+Arrays.toString(list));
		System.out.print("The common elements are:");
		
		for (int i = 0; i < list.length; i++) {
			if(list[i]>0) {
				System.out.print(list[i]+",");
			}
		}
	}
}
