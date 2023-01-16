package com.rays.ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyBoard {
	public static void main(String[] args) throws Exception {
		//FileReader fr = new FileReader(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.println("start.......");
		
		FileWriter fw = new FileWriter("D:/hello.txt");
		PrintWriter pw = new PrintWriter(fw);

		String line = br.readLine();
		while(!line.equals("quit")) {
		pw.println(line);
		line=br.readLine();
	}
		System.out.println("done");

		pw.close();
		br.close();
	}
	
	

}
