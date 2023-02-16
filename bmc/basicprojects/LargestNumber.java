package com.basicprojects;

public class LargestNumber {

	public static void main(String[] args) {
		
		int arr[]= {30,90,40,60,70};
		int smallestnumber=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(smallestnumber>arr[i]) {
				smallestnumber=arr[i];
				
			}}
			System.out.println(smallestnumber);
		
	}

}
