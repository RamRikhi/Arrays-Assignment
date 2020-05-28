package com.rm.threeDigits;

import java.util.Arrays;

public class ThreeDigits {
	public static void main(String[] args) {
		int[] arr= {0, 1, 0, 2, 0, 0, 2, 1, 2, 0,2,1,2,1,0};
		System.out.println("Before sorting:"+Arrays.toString(arr));
		arr=sortDigits(arr);
		System.out.println("After sorting:"+Arrays.toString(arr));
	}

	public static int[] sortDigits(int[] arr) {
		int size=0,size2=0,size3=0;
		int count=0,count2=0;
		int[] temp=new int[arr.length];
		int[] temp1=new int[arr.length];
		int[] temp2=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(0==arr[i]) {
				temp[size++]=arr[i];
				count++;
			}else if(1==arr[i]) {
				temp1[size2++]=arr[i];
				count2++;
			}else if(2==arr[i]) {
				temp2[size3++]=arr[i];
			}
		}
		size=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=temp[i];
		}
		for (int i = count; i < arr.length; i++) {
			arr[i]=temp1[size++];
		}
		size=0;
		for (int i = (count+count2); i < arr.length; i++) {
			arr[i]=temp2[size++];
		}
		return arr;
	}
}
