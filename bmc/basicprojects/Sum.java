package com.bmc.basicprojects;

public class Sum {

	public static void main(String[] args) {
		int number=1122;
	
		int evensum=0;
		int oddsum=0;
		int sum=0;
		while(number!=0) {
			int digit=number%10;
			if(digit%2==0) {
				evensum=evensum+digit;
				
			}else {
				oddsum=oddsum+digit;
				
			}
			sum=evensum+oddsum;
			number=number/10;
		}
		System.out.println("sum:"+sum);
		
		}

}
