// Demonstrate ByteArrayInputStream

package com.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte[] b = tmp.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(b, 0, 3);
		for(int i=0;i<2; i++) {
			int c;
			while((c=in.read())!=-1) {
				if(i==0) {
					System.out.print((char)c);
				} else {
					System.out.print(Character.toUpperCase((char)c));
				}
			}
			System.out.println();
			in.reset();
		}
	}

}
