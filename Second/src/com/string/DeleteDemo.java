package com.string;

// Demonstrate delete() and deleteCharAt()
public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("This is a test.");
		
		sb.delete(4, 7);
		System.out.println("After delete: "+sb);
		
		sb.deleteCharAt(0);
		System.out.println("After deleteCharAt: "+sb);
	}

}
