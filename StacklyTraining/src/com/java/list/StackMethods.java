package com.java.list;
import java.util.*;

public class StackMethods {

	    public static void main(String[] args) {

	        Stack<String> stack = new Stack<>();

	        // push()
	        stack.push("Java");
	        stack.push("Python");
	        stack.push("Spring");
	        stack.push("SQL");

	        System.out.println("Stack: " + stack);

	        // peek()
	        System.out.println("Top Element: " + stack.peek());

	        // search()
	        System.out.println("Position of Python: " + stack.search("Python"));

	        // empty()
	        System.out.println("Is Stack Empty? " + stack.empty());

	        // pop()
	        System.out.println("Removed: " + stack.pop());
	        System.out.println("Stack after pop(): " + stack);

	        // push()
	        stack.push("Hibernate");
	        System.out.println("After push(): " + stack);

	        // size()
	        System.out.println("Size: " + stack.size());

	        // firstElement() (Inherited from Vector)
	        System.out.println("First Element: " + stack.firstElement());

	        // lastElement()
	        System.out.println("Last Element: " + stack.lastElement());

	        // capacity()
	        System.out.println("Capacity: " + stack.capacity());

	        // clear()
	        stack.clear();
	        System.out.println("After clear(): " + stack);

	        // empty()
	        System.out.println("Is Stack Empty? " + stack.empty());
	    }
}
