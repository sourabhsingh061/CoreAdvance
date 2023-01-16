package com.rays.ios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("D:/object.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet(10,"sourabh","math");
		
		System.out.println(m.getId()+" "+ m.getName()+" "+m.getSubject());
		
		out.writeObject(m);
		
		out.close();
		file.close();
		
		
	}
	

}
