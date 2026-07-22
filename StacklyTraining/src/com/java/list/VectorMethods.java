package com.java.list;
import java.util.*;

public class VectorMethods {

	    public static void main(String[] args) {

	        Vector<String> vector = new Vector<>();

	        // addElement()
	        vector.addElement("Java");
	        vector.addElement("Python");
	        vector.addElement("C++");

	        System.out.println("Original Vector: " + vector);

	        // capacity()
	        System.out.println("Capacity: " + vector.capacity());

	        // ensureCapacity()
	        vector.ensureCapacity(20);
	        System.out.println("Capacity after ensureCapacity(20): " + vector.capacity());

	        // firstElement()
	        System.out.println("First Element: " + vector.firstElement());

	        // lastElement()
	        System.out.println("Last Element: " + vector.lastElement());

	        // insertElementAt()
	        vector.insertElementAt("Spring", 1);
	        System.out.println("After insertElementAt(): " + vector);

	        // elementAt()
	        System.out.println("Element at index 2: " + vector.elementAt(2));

	        // setElementAt()
	        vector.setElementAt("JavaScript", 2);
	        System.out.println("After setElementAt(): " + vector);

	        // removeElement()
	        vector.removeElement("Python");
	        System.out.println("After removeElement(): " + vector);

	        // removeElementAt()
	        vector.removeElementAt(1);
	        System.out.println("After removeElementAt(): " + vector);

	        // setSize()
	        vector.setSize(5);
	        System.out.println("After setSize(5): " + vector);

	        // trimToSize()
	        vector.trimToSize();
	        System.out.println("Capacity after trimToSize(): " + vector.capacity());

	        // copyInto()
	        Object arr[] = new Object[vector.size()];
	        vector.copyInto(arr);

	        System.out.print("copyInto(): ");
	        for (Object obj : arr) {
	            System.out.print(obj + " ");
	        }
	        System.out.println();

	        // elements()
	        System.out.print("Enumeration: ");
	        Enumeration<String> e = vector.elements();
	        while (e.hasMoreElements()) {
	            System.out.print(e.nextElement() + " ");
	        }
	        System.out.println();

	        // removeAllElements()
	        vector.removeAllElements();
	        System.out.println("After removeAllElements(): " + vector);
	    }

}
