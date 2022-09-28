package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationStudent {
     public static void main(String[] args) throws IOException {
		Student s=new Student();
		s.setFirstname("ajay");
		s.setLastname("krishna");
		s.setLastname("pune");
		
		FileOutputStream fos=null;
		ObjectOutputStream obj=null;
		try {
			fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\Demo.txt");
			obj=new ObjectOutputStream(fos);
			obj.writeObject(s);
			System.out.println("Serialization done");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fos.close();
			obj.close();
		}
		
		
	}
}
