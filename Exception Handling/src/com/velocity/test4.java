package com.velocity;

import java.io.EOFException;
import java.io.IOException;

public class test4 {
	public static void main(String[] args) throws IOException {
		try {
			System.out.println("1");
			int value = 10 / 0;
			throw new IOException();
		} catch (EOFException e) {
			System.out.println("2");
		} catch (ArithmeticException e) {
			System.out.println("3");
		} catch (NullPointerException e) {
			System.out.println("4");
		} catch (IOException e) {
			System.out.println("5");
		} catch (Exception e) {
			System.out.println("6");
		}
	}
}
