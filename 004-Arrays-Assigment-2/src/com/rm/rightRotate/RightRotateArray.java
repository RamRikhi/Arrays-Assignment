package com.rm.rightRotate;

import java.util.Arrays;

public class RightRotateArray {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,10,40,6,8,9};
		int postion=4;
		System.out.println("Before right Rotation::"+Arrays.toString(arr));
		int rotate[]=rightRotateArray(arr,postion);
		System.out.println("After right Rotation::"+Arrays.toString(rotate));
	}

	public static int[] rightRotateArray(int[] arr, int postion) {
		int[] temp =new int[arr.length];
		int index2 = arr.length-postion;
		int index = 0;
		//Shifting right to left side
		for (int i = index2; i < arr.length; i++) {
			temp[index++]=arr[i];
		}
	
		index2=0;
		//shift the remaining array element to left right side
		for (int i = index; i < temp.length; i++) {
			temp[i]=arr[index2++];
		}
		//copying the temp array to arr array
		for (int i = 0; i < arr.length; i++) {
			arr[i]=temp[i];
		}
		return arr;
	}
}
