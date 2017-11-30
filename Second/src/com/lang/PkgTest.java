package com.lang;

//Demonstrate Package class

public class PkgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Package pkgs[];
		pkgs = Package.getPackages();

		for (int i = 0; i < pkgs.length; ++i) {
			System.out.println(pkgs[i].getName() + " " + pkgs[i].getImplementationTitle() + " "
					+ pkgs[i].getImplementationVendor() + " " + pkgs[i].getImplementationVersion());
			System.out.println();
		}
	}

}
