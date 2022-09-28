package com.assighment19;

import java.util.Scanner;

public class CountAlphabetVowelAndNumber {

	public static void main(String[] args) {
         int digitcount=0;
         int alphabetcount=0;
         int vowelcount=0;
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57) {
				digitcount++;
			}
			if((ch>='a'&&ch<='z')||(ch<='A'&&ch>='Z')) {
				alphabetcount++;
			}
			if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'||
					ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u') {
				vowelcount++;
			}
		}
		System.out.println("num of digit in string.." +digitcount);
		System.out.println("numof alphabet in string.." +alphabetcount);
		System.out.println("num of vowel count in string.." +vowelcount);
	}
}
