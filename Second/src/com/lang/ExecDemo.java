package com.lang;

// Demonstrate exec().
public class ExecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try {
			p = r.exec("notepad");
			p.waitFor();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error executing notepade.");
		}
		System.out.println("Notepad returned "+p.exitValue());
	}

}
