package com.rays.ios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDesrialization {
	
		public static void main(String[] args) throws Exception {
			FileInputStream file = new FileInputStream("D:/object.ser");
			ObjectInputStream out = new ObjectInputStream(file);
			
			Marksheet m =  (Marksheet) out.readObject();
			
			//System.out.println(m.getId());
			//System.out.println(m.getName());
			//System.out.println(m.getSubject());
			System.out.println("done");

			out.close();
			file.close();
			
			
		}

}
