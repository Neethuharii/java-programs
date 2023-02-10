package com.bmc.basicprojects;

public class Secondlargest {

	public static void main(String[] args) {
		int arr[]= {30,90,40,60,70};
		
		int secondlargestnumber=Integer.MIN_VALUE;
		int largestnumber=Integer.MIN_VALUE;

		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestnumber) {
				secondlargestnumber=largestnumber;
				largestnumber=arr[i];
			}else if(arr[i]>secondlargestnumber) {
				secondlargestnumber=arr[i];
			}
			}
			System.out.println(secondlargestnumber);
	}

}
