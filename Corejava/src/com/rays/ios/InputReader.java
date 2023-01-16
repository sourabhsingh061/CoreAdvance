package com.rays.ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputReader {
	public static void main(String[] args) throws Exception {
		try(FileReader fr = new FileReader("D:/hello.txt")){
		BufferedReader br = new BufferedReader(fr);
		
	    String s = br.readLine();
		while(s!=null) {
			System.out.println(s);
			s = br.readLine();
		}
		//int ch = fr.read();
		//while (ch != -1) {
		//	System.out.println((char) ch);
	    //		ch = fr.read();
		//}
		//fr.close();
		}
	}

}
