package com.basicprojects;

public class EvenAndOdd {

	public static void main(String[] args) {
		int number=45678;                                                                                                                                                                    
	int evennumber=0;
	int oddnumber=0;
	while(number!=0) {
		int digit=number%10;
		if(digit%2==0) {
			evennumber++;
			
		}else {
			oddnumber++;
			
		}
		number=number/10;
	}
	System.out.println("even number"+evennumber);
	System.out.println("odd number"+oddnumber);
	}

}
