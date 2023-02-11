package com.basicprojects;

public class Duplicate {

	public static void main(String[] args) {
		int a[]= {10,30,40,50,10,30};
		for(int j=0;j<a.length;j++) {
			boolean flag=false;
			for(int i=j+1;i<a.length;i++) {
				if(a[i]==a[j] && a[i]!=Integer.MAX_VALUE) {
					a[i]=Integer.MAX_VALUE;
					flag=true;
				}
				
		
		 }
			if(flag==false) {
				System.out.println(a[j]);
			}
	 }
	
	}

}
