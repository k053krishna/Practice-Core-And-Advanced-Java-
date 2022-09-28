package com.velocity;

public class FinnalyDemo {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.exit(2);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("this is final block");
		}
	}

	private static void exit() {
		
		
	}
}
