// A word counting utility.

package com.io;

import java.io.*;

public class WordCount {

	public static int words = 0;
	public static int lines = 0;
	public static int chars = 0;

	public static void wc(InputStreamReader isr) throws IOException {

		int c = 0;
		boolean lastWhite = true;
		String whiteSpace = " \t\n\r";

		while ((c = isr.read()) != -1) {
			// count characters
			++chars;
			// count lines
			if (c == '\n')
				++lines;
			// count words by detectiong the start of a word
			int index = whiteSpace.indexOf(c);
			if (index == -1) {
				if (lastWhite == true) {
					++words;
				}
				lastWhite = false;
			} else {
				lastWhite = true;
			}
		}
		if (chars != 0) {
			++lines;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr;
		try {
			if (args.length == 0) {
				wc(new InputStreamReader(System.in));
			} else {
				for (int i = 0; i < args.length; i++) {
					fr = new FileReader(args[i]);
					wc(fr);
				}
			}
		} catch (IOException e) {
			return ; // TODO: handle exception
		}
		System.out.println(lines+" "+words+" "+chars);
	}

}
