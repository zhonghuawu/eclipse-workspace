package com.huaa;

public class Exc1 {

	public static void subroutine() {
		int d = 0;
		try {
			@SuppressWarnings("unused")
			int a = 10 / d;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc1.subroutine();
	}

}
