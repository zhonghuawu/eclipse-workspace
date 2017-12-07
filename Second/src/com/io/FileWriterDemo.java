// Demonstrate FileWriter

package com.io;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String source = "Now is the time for all good men\n"
				+ " to come to the aid of their country\n"
				+ " and play their due taxed.";
		char[] buffer =  new char[source.length()];
		source.getChars(0, source.length(), buffer, 0);
		
		FileWriter f0 = new FileWriter("file1.txt");
		for(int i=0; i<buffer.length; i+=2) {
			f0.write(buffer[i]);
		}
		f0.close();
		
		FileWriter f1 = new FileWriter("file2.txt");
		f1.write(buffer);
		f1.close();
		
		FileWriter f2 = new FileWriter("file3.txt");
		f2.write(buffer, buffer.length-buffer.length/4, buffer.length/4);
		f2.close();
	}

}
