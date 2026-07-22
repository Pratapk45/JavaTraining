package com.java.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	    public static void main(String[] args) {

	        LinkedList<String> list = new LinkedList<>();

	        // addFirst()
	        list.addFirst("Java");

	        // addLast()
	        list.addLast("Python");

	        // add()
	        list.add("C++");

	        System.out.println("Original List: " + list);

	        // getFirst()
	        System.out.println("First Element: " + list.getFirst());

	        // getLast()
	        System.out.println("Last Element: " + list.getLast());

	        // offer()
	        list.offer("HTML");
	        System.out.println("offer(): " + list);

	        // offerFirst()
	        list.offerFirst("Spring");
	        System.out.println("offerFirst(): " + list);

	        // offerLast()
	        list.offerLast("CSS");
	        System.out.println("offerLast(): " + list);

	        // peek()
	        System.out.println("peek(): " + list.peek());

	        // peekFirst()
	        System.out.println("peekFirst(): " + list.peekFirst());

	        // peekLast()
	        System.out.println("peekLast(): " + list.peekLast());

	        // poll()
	        System.out.println("poll(): " + list.poll());
	        System.out.println(list);

	        // pollFirst()
	        System.out.println("pollFirst(): " + list.pollFirst());
	        System.out.println(list);

	        // pollLast()
	        System.out.println("pollLast(): " + list.pollLast());
	        System.out.println(list);

	        // push()
	        list.push("Oracle");
	        System.out.println("push(): " + list);

	        // pop()
	        System.out.println("pop(): " + list.pop());
	        System.out.println(list);

	        // descendingIterator()
	        System.out.print("Descending Order: ");

	        Iterator<String> itr = list.descendingIterator();

	        while (itr.hasNext()) {
	            System.out.print(itr.next() + " ");
	        }

	        System.out.println();

	        // removeFirst()
	        list.removeFirst();
	        System.out.println("removeFirst(): " + list);

	        // removeLast()
	        list.removeLast();
	        System.out.println("removeLast(): " + list);

	    }

}
