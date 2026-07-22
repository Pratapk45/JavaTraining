package com.java.list;
import java.util.*;

public class ArrayListMethods {

	    public static void main(String[] args) {

	        ArrayList<Integer> list = new ArrayList<>();

	        list.add(50);
	        list.add(10);
	        list.add(40);
	        list.add(20);
	        list.add(30);

	        System.out.println("Original List: " + list);

	        // ensureCapacity()
	        list.ensureCapacity(20);
	        System.out.println("ensureCapacity(20) executed.");

	        // trimToSize()
	        list.trimToSize();
	        System.out.println("trimToSize() executed.");

	        // clone()
	        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone();
	        System.out.println("Clone: " + copy);

	        // sort()
	        Collections.sort(list);
	        System.out.println("Sorted List: " + list);

	        // replaceAll()
	        list.replaceAll(n -> n * 2);
	        System.out.println("replaceAll(): " + list);

	        // removeIf()
	        list.removeIf(n -> n > 60);
	        System.out.println("removeIf(): " + list);

	        // forEach()
	        System.out.print("forEach(): ");
	        list.forEach(x -> System.out.print(x + " "));
	        System.out.println();

	        // spliterator()
	        Spliterator<Integer> sp = list.spliterator();
	        System.out.print("Spliterator: ");
	        sp.forEachRemaining(System.out::print);
	    }

}
