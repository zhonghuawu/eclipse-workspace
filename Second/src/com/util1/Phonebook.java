/***
 * A simple telephone number database that uses a property list.
 */
package com.util1;

import java.io.*;
import java.util.*;

public class Phonebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties ht = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name, number;
		FileInputStream fin = null;
		boolean changed = false;
		
		// try to open phonebook.dat file.
		try {
			fin = new FileInputStream("phonebook.dat");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			// ignore missing file
		}
		
		// if phonebook file already exists, load existing telephone numbers.
		try {
			if(fin!=null) {
				ht.load(fin);
				fin.close();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error reading files.");
		}
		
		// Let user enter new names and numbers.
		do {
			System.out.println("Enter new name"+" ('quit' to stop):");
			name = br.readLine();
			if(name.equals("quit"))
				continue;
			System.out.println("Enter number: ");
			number = br.readLine();
			
			ht.put(name, number);
			changed = true;
		} while(!name.equals("quit"));
		
		// if phone book data has changed, save it.
		if(changed) {
			FileOutputStream fout = new FileOutputStream("phonebook.dat");
			ht.store(fout, "Telephone Book");
			fout.close();
		}
		
		// Look up numbers given a name.
		do {
			System.out.println("Enter name to find"+" ('quit' to stop): ");
			name = br.readLine();
			if(name.equals("quit"))
				continue;
			number = (String) ht.get(name);
			System.out.println(number);
		} while(!name.equals("quit"));
	}

}
