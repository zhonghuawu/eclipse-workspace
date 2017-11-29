package com.huaa.io;

import java.io.*;

public class ShowFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i;
		FileInputStream fin;
		
		try {
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found: "+args[0]);
			return;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		do {
			i = fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);
		
		fin.close();
	}

}
