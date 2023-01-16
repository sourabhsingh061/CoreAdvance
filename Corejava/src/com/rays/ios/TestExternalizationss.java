package com.rays.ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizationss {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("D:/jaihind.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		StudentsextErnalizations m = new StudentsextErnalizations(77,"naman","history");
		
		//System.out.println(m.getId()+" "+ m.getName()+" "+m.getSubject());
		
		m.writeExternal(out);
		System.out.println("done");
		
		FileInputStream file1 = new FileInputStream("D:/jaihind.ser");
		ObjectInputStream out1 = new ObjectInputStream(file1);
		
		 m.readExternal(out1);
		
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getSubject());

		
		out1.close();
		file1.close();
		
		
	}

}
