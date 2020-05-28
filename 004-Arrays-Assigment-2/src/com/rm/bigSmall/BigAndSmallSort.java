package com.rm.bigSmall;

import java.util.Arrays;

public class BigAndSmallSort {
	public static void main(String[] args) {
		int[] arr= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		//Before sorting the array
		System.out.println("Before sorted:"+Arrays.toString(arr));
		//here method call for sorting 
		arr=BigAndSmallSort.sortBigAndSmall(arr);
		//After sorting the array
		System.out.println();
		System.out.println("After sorted:"+Arrays.toString(arr));
	}

	
	public static int[] sortBigAndSmall(int[] arr) {
		int temp=0,size=0,count=0;
		int len=arr.length;
		int[] sort=new int[len];
		int[] sort2=new int[len];
		
		//Sorting the array elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Copying the half of array to another array
		for (int i = 0; i < (len/2); i++) {
			sort[size++]=arr[i];
			count++;
		}
		size=0;
		//Copying the half of array to another array
		for (int i = count; i < arr.length; i++) {
			sort2[size++]=arr[i];
		}
		size=0;
		int temp2=arr.length;
		temp2 = temp2/2;
		//Here sorting the array order like big  and small
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0) {
				arr[i]=sort[size++];
			}else {
				arr[i]=sort2[--temp2];
			}
		}
		return arr;
	}
}
