// Demonstrate sequenced input

package com.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

@SuppressWarnings("rawtypes")
class InputStreamEnumerator implements Enumeration {
	private Enumeration<Object> files;

	public InputStreamEnumerator(Vector<Object> files) {
		// TODO Auto-generated constructor stub
		this.files = files.elements();
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return files.hasMoreElements();
	}

	public InputStream nextElement() {
		// TODO Auto-generated method stub
		try {
			return new FileInputStream(files.nextElement().toString());
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int c;
		Vector<Object> files = new Vector<>();
		files.addElement("file1.txt");
		files.addElement("file2.txt");

		@SuppressWarnings("rawtypes")
		Enumeration e = new InputStreamEnumerator(files);
		@SuppressWarnings("unchecked")
		SequenceInputStream input = new SequenceInputStream(e);
		while ((c = input.read()) != -1) {
			System.out.print((char) c);
		}
		input.close();
	}

}
