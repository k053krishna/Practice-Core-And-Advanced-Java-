package com.velocity;

import java.io.FileWriter;
import java.io.IOException;

public class FilleWriteExample {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\Users\\Shree\\Desktop\\New Text Document.txt");
			fw.write("this is the kishna ,writing program on eclips");
			System.out.println("data is written succesfully");
		} catch (Exception e) {
		e.printStackTrace();
		
		} finally {
			fw.close();
		}
	}
}
