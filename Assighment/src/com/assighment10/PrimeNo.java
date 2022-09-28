package com.assighment10;

public class PrimeNo {
	public static void main(String[] args) {
		int n = 200;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					count++;
				}
			}
			if (count == 0) {

				System.out.println(+i);
			}
		}
	}
}
