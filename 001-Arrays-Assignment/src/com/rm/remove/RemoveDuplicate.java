package com.rm.remove;

import java.util.Arrays;

public class RemoveDuplicate {
	public static int[] removeDupilcate(int[] arr) {
		int len=arr.length;
		for (int i = 0; i <len; i++) {
			for (int j = i+1; j < len; j++) {
			   if(arr[i] == arr[j]) {
					arr[i]=0;
				}
			}	
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] list= {1, 2, 5, 5, 6, 6, 7, 2};
		System.out.println("Before remove:"+Arrays.toString(list));
		int[] remove=removeDupilcate(list);
		System.out.print("After remove:");
		for (int i = 0; i < remove.length; i++) {
			if(remove[i]>0 || 0<remove[i]) {
				System.out.print(remove[i]+",");
			}
		}
	}
}
