package com.velocity;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ReadLineExample {
	public static void main(String[] args) throws IOException {

		FileInputStream fls = null;
		Scanner sc = null;

		try {
			fls = new FileInputStream("C:\\Users\\Shree\\Desktop\\New Text Document.txt");
			sc = new Scanner(fls);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fls.close();
			sc.close();
		}
	}
}
