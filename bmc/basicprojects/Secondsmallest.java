package com.bmc.basicprojects;

public class Secondsmallest {

	public static void main(String[] args) {
		
		
		int secondsmallestnumber=Integer.MAX_VALUE;
		int smallestnumber=Integer.MAX_VALUE;
		int arr[]= {30,90,40,60,70};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestnumber) {
				secondsmallestnumber=smallestnumber;
				smallestnumber=arr[i];
			}else if(arr[i]<secondsmallestnumber) {
				secondsmallestnumber=arr[i];
			}
			}
			System.out.println(secondsmallestnumber);
	}




	}


