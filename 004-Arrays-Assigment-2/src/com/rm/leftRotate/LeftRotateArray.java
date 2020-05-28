package com.rm.leftRotate;

import java.util.Arrays;

public class LeftRotateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int postion=2;
		System.out.println("Before left Rotation::"+Arrays.toString(arr));
		int rotate[]=leftRotateArray(arr,postion);
		System.out.println("After left Rotation::"+Arrays.toString(rotate));
	}

	public static int[] leftRotateArray(int[] arr, int p) {
		int len=arr.length;
		int index=0;
		int size=0;
		int[] temp=new int[len];
		
		for (int i = 0; i < len; i++) {
			if(p==arr[i]) {
				index=i;
				break;
			}
		}
		for (int i = index+1; i < len; i++) {
			temp[size++]=arr[i];
		}
		for (int i =0; i <=index; i++) {
			temp[size++]=arr[i];
		}
		for (int i = 0; i < len; i++) {
			arr[i]=temp[i];
		}
		return arr;
	}
}
