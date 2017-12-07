package com.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("src/com/io/FileReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		fr.close();
		
	}

}
