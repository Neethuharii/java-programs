package com.bmc.basicprojects;

public class Numberpattern {

	public static void main(String[] args) {
		int count = 5;
		for (int i = 0; i <= 3; i++) {
			for (int j = 1; j <= i + 1; j++) {

				System.out.print(count + " ");
				count = count + 5;
			}
			System.out.println();
		}

	}

}
