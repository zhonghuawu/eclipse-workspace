package com.huaa.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try {
			try {
				fin = new FileInputStream(args[0]);
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Input File Not Found: " + args[0]);
				return;
			}

			try {
				fout = new FileOutputStream(args[1]);
			} catch (FileNotFoundException e) {
				System.out.println("Output File Not Found: " + args[1]);
				fin.close();
				return;
			} 
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		try {
			do {
				i = fin.read();
				if(i!=-1)
					fout.write(i);
			}while(i!=-1);
		} catch (IOException e) {
			// TODO: handle exception			
			System.out.println("File Error");
		}
		
		fin.close();
		fout.close();
	}

}
