package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException {
    	
    	FileInputStream fis=null;
    	ObjectInputStream obj=null;
		try {
			 fis= new FileInputStream("C:\\Users\\Shree\\Desktop\\Demo.txt");
			 obj=new ObjectInputStream(fis);
			Object o=obj.readObject();
			Student s=(Student)o;
			System.out.println(s.getFirstname());
			System.out.println(s.getLastname());
			System.out.println(s.getCity());
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			fis.close();
			obj.close();
		}
	}
}
