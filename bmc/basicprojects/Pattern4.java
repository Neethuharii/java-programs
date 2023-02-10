package com.bmc.basicprojects;

public class Pattern4 {

	public static void main(String[] args) {
		int count = 2;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 2; j++) {

				System.out.print(count + " ");
				count = count + count;
			}
			System.out.println();
		}

	}

}
