package com.java.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
 
		FileInputStream fis =new FileInputStream("StudentData");
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		Student s1 = (Student) ois.readObject();
		System.out.println(s1.studentId);
		System.out.println(s1.studentName);
		System.out.println("-----------------");
		s1.display();
	}

}
