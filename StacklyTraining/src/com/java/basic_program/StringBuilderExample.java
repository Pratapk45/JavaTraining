package com.java.basic_program;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        StringBuilder sb = new StringBuilder("Java");

		        System.out.println("Original String : " + sb);

		        sb.append(" Full Stack");
		        System.out.println("Append  : " + sb);

		        sb.insert(5, "Developer ");
		        System.out.println("Insert  : " + sb);

		        sb.replace(5, 14, "Spring ");
		        System.out.println("Replace  : " + sb);

		        sb.delete(5, 12);
		        System.out.println("Delete   : " + sb);

		        sb.reverse();
		        System.out.println("Reverse  : " + sb);

		        System.out.println("Length   : " + sb.length());
		        System.out.println("Capacity : " + sb.capacity());
		    }

}
