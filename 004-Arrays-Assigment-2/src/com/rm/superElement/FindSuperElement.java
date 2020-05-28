package com.rm.superElement;

import java.util.Arrays;

public class FindSuperElement {
	public static void main(String[] args) {
		int[] input= {1, 5,1, 5, 3, 6};
		boolean flag=true;
		System.out.println("Before found super element:"+Arrays.toString(input));
		input=FindSuperElement.findSuperElement(input);
		//checking greater than 0 element 
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=0) {
				flag=false;
			}
		}
		//print the result
		if (flag==true) {
			System.out.println("No super element found.");
		}else {
			System.out.print("Super elements are:");
			for (int i = 0; i < input.length; i++) {
				if(input[i]!=0)
				    System.out.print(input[i]+",");
			}
		}
	}

	public static int[] findSuperElement(int[] input) {
		int[] temp=new int[input.length];
		int count=0,size=0;
		//finding super elements
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(input[j]>input[i]) {
					count++;
				}
			}
			if(count>=2) {
				temp[size++]=input[i];
			}
			count=0;
		}
		//copying one array to another array
		for (int i = 0; i < input.length; i++) {
			input[i]=temp[i];
		}
		return input;
	}
}
