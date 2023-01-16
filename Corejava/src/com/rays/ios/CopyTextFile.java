package com.rays.ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyTextFile {
	public static void main(String[] args) throws Exception {
		String source = "D:/hello.txt";
		String target = "D:/java.txt";
		FileReader fr = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		
		
		int ch = fr.read();
		while (ch!=-1){
			fw.write(ch);
			ch=  fr.read();
			
		}
		fr.close();
		fw.close();
		System.out.println(source +"is copied to"+ target);
	}
	

}
