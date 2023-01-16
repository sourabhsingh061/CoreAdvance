package com.rays.ios;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class InputWriter {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("D:/hello.txt",true);
		fw.write(" vidhya sagar");
		
		fw.close();
		System.out.println("done");
		
		/*PrintWriter pw = new PrintWriter("D:/hello.txt");
		pw.write("sourabh");
		pw.close();
		System.out.println("Done");*/
	
	}
	
}
