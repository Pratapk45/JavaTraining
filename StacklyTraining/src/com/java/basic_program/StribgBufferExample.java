package com.java.basic_program;

public class StribgBufferExample {

	public static void main(String[] args) {

		        StringBuffer sb = new StringBuffer("Java");

		        System.out.println("Original String : " + sb);

		        sb.append(" Programming");
		        System.out.println("Append : " + sb);

		        sb.insert(5, "Core ");
		        System.out.println("Insert : " + sb);

		        sb.replace(5, 9, "Advanced ");
		        System.out.println("Replace : " + sb);

		        sb.delete(5, 14);
		        System.out.println("Delete  : " + sb);

		        sb.reverse();
		        System.out.println("Reverse  : " + sb);

		        System.out.println("Length  : " + sb.length());
		        System.out.println("Capacity  : " + sb.capacity());
		    
	}

}
