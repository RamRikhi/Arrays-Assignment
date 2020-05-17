package com.rm.duplicate;

import java.util.Arrays;

public class FindDuplicate {
	public static int[] findDuplicate(int arr[]) {
		int len=arr.length;
		int size=0;
		int[] duplicate=new int[len];
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					duplicate[size++]=arr[i];
				}
			}
		}
		return duplicate;
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		int[] list=findDuplicate(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.print("Duplicate elements are:");
		for (int i = 0; i < list.length; i++) {
			if(list[i]>0) {
				System.out.print(list[i]+",");
			}
		}
	}

}
