package com.rm.leader;

public class LeaderNumber {
	public static void main(String[] args) {
		int[] input = { 1, 6, 6, 5, 7, 4, 1, 7, 7, 7, 7, 7, 7, 7, 2 };
		//Printing the array before searching the leader element
		System.out.print("Elements are :");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+", ");
		}
		System.out.println();
		//method calling 
		String leader=LeaderNumber.getLeaderElement(input);
		//printing the leader element
		System.out.println(leader);

	}

	public static String getLeaderElement(int[] input) {
		int count=0,temp=0,holder=0,temp2=0,len=0;
		//here searching the leader element
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(input[i]==input[j]) {
					count++;
				}
				if(count>temp) {
					holder=input[i];
					temp2=count;
				}
			}
			temp=count;
			count=0;
		}
		len=input.length;
		len=len/2;
		return (temp2>len) ? "The leader element is:: "+holder:"No leader element found";
	}
}
