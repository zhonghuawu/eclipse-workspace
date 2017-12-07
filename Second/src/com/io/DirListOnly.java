// Directory of .class files.

package com.io;

import java.io.File;
import java.io.FilenameFilter;

import com.io.OnlyExt;

public class DirListOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dirname = "bin/com/io";
		File f1 = new File(dirname);
		FilenameFilter only = new OnlyExt("class");
		String[] s = f1.list(only);

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
