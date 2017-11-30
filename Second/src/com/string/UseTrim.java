package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

// Use trim() to process commands.
public class UseTrim {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		
		PrintStream ps = new PrintStream(System.out);
		ps.println("Enter 'stop' to quit.");
		ps.println("Enter State: ");
		do {
			str = br.readLine();
			str = str.trim();
			
			if(str.equals("Illinois")) {
				ps.println("Capital is Springfield.");
			} else if(str.equals("Missouri")) {
				ps.println("Capital is Jefferson City.");
			} else if(str.equals("California")) {
				ps.println("Capital is Sacramento.");
			} else if(str.equals("Washington")) {
				ps.println("Capital is Olympia");
			}
		} while(!str.equals("stop"));
	}

}
