package com.io;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {

	String ext;

	public OnlyExt(String ext) {
		this.ext = "." + ext;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(ext);
	}

}