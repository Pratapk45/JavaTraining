package com.java.list;
import java.util.*;

public class CollectionDiffMethods {

	    public static void main(String[] args) {

	        // ================= ArrayList =================
	        System.out.println("===== ArrayList Methods =====");

	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("Java");
	        arrayList.add("Python");
	        arrayList.add("Spring");

	        arrayList.ensureCapacity(20);
	        arrayList.trimToSize();

	        ArrayList<String> cloneList = (ArrayList<String>) arrayList.clone();

	        Collections.sort(arrayList);

	        arrayList.replaceAll(str -> str.toUpperCase());

	        arrayList.removeIf(str -> str.startsWith("P"));

	        System.out.println("ArrayList : " + arrayList);
	        System.out.println("Clone : " + cloneList);

	        // ================= LinkedList =================
	        System.out.println("\n===== LinkedList Methods =====");

	        LinkedList<String> linkedList = new LinkedList<>();

	        linkedList.add("Java");
	        linkedList.add("Python");

	        linkedList.addFirst("HTML");
	        linkedList.addLast("SQL");

	        System.out.println("First : " + linkedList.getFirst());
	        System.out.println("Last : " + linkedList.getLast());

	        linkedList.offer("CSS");
	        linkedList.offerFirst("Spring");
	        linkedList.offerLast("Bootstrap");

	        System.out.println("Peek : " + linkedList.peek());

	        linkedList.poll();

	        linkedList.push("Hibernate");

	        System.out.println("Pop : " + linkedList.pop());

	        System.out.println("LinkedList : " + linkedList);

	        // ================= Vector =================
	        System.out.println("\n===== Vector Methods =====");

	        Vector<Integer> vector = new Vector<>();

	        vector.addElement(10);
	        vector.addElement(20);
	        vector.addElement(30);

	        System.out.println("Capacity : " + vector.capacity());

	        vector.ensureCapacity(20);

	        vector.insertElementAt(15,1);

	        System.out.println("First Element : " + vector.firstElement());
	        System.out.println("Last Element : " + vector.lastElement());

	        vector.removeElement(20);

	        vector.setElementAt(100,1);

	        System.out.println("Vector : " + vector);

	        // ================= Stack =================
	        System.out.println("\n===== Stack Methods =====");

	        Stack<String> stack = new Stack<>();

	        stack.push("Java");
	        stack.push("Python");
	        stack.push("Spring");

	        System.out.println("Peek : " + stack.peek());

	        System.out.println("Search(Java) : " + stack.search("Java"));

	        System.out.println("Pop : " + stack.pop());

	        System.out.println("Is Empty : " + stack.empty());

	        System.out.println("Stack : " + stack);
	    }

}
