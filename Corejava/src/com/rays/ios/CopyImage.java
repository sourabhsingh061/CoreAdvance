package com.rays.ios;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyImage {
	

	
		public static void main(String[] args) throws Exception {
			String source = "D:/sr.jpg";
			String target = "D:/sttt.jpg";
			FileInputStream fr = new FileInputStream(source);
			FileOutputStream fw = new FileOutputStream(target);
			
			
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


