package com.basicprojects;

public class Arraycopy {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int a[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			a[i] = arr[i];

			System.out.print(a[i] + " ");
		}

	}

}
