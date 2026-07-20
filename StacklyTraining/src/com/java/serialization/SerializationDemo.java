package com.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int studentId;
	String studentName;
	
	public void display() {
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Name :"+studentName);
	}
}

public class SerializationDemo {
	
	public static void main(String[] args) throws IOException {
		
		Student s= new Student();
		s.studentId = 101;
		s.studentName = "Pratap"; 
		
		String FileName="StudentData";
		
		FileOutputStream fos = new FileOutputStream(FileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		oos.close();
		fos.close();
		
		System.out.println("Object Store in file");
		
		
		
	}
	
}
