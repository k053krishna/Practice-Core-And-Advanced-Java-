package com.assighment14;

public class Table {

	public static void main(String[] args) {

		for (int t = 1; t <= 10; t++) {// outer block contain the row

			for (int i = 1; i <= 20; i++) {// iner block contin the column

				int result = t * i;

				System.out.printf("%4d", result);
			}
			System.out.print("\n");
		}
	}
}
