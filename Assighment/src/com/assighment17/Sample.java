package com.assighment17;

import java.io.FileInputStream;
import java.util.Scanner;

/* Write a Java Program for counting the vowels and numbers from file( 
abc.txt)
*/
public class Sample {

	public static void main(String[] args) {
		int vowelCount = 0;
		int numberCount = 0;
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shree\\Desktop\\New Text Document.txt");
			Scanner sc = new Scanner(fis);
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				for (int i = 0; i < s.length(); i++) {
					char ch = s.charAt(i);
					if (ch == 65 || ch == 97 || ch == 69 || ch == 101 || ch == 73 || ch == 105 || ch == 79 || ch == 111
							|| ch == 85 || ch == 117) {
						vowelCount++;
					}
						if (ch >= 48 && ch <= 57) {
							numberCount++;
						}
					}
				}
			sc.close();
			fis.close();
			
			System.out.println("total number of vowel count..." +vowelCount);
			System.out.println("total number of number count.." +numberCount);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
