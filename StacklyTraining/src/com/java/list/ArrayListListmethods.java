package com.java.list;
import java.util.*;

public class ArrayListListmethods {

	    public static void main(String[] args) {

//	        List<String> list = new ArrayList<>();
	    	
	    	ArrayList<String> list = new ArrayList<>();

	        // add(E)
	        list.add("Java");
	        list.add("Python");
	        list.add("C++");
	        System.out.println("After add(): " + list);

	        // add(index,E)
	        list.add(1, "Spring");
	        System.out.println("After add(index): " + list);

	        // addAll()
	        List<String> list2 = new ArrayList<>();
	        list2.add("HTML");
	        list2.add("CSS");
	        list.addAll(list2);
	        System.out.println("After addAll(): " + list);

	        // get()
	        System.out.println("get(2): " + list.get(2));

	        // set()
	        list.set(2, "JavaScript");
	        System.out.println("After set(): " + list);

	        // contains()
	        System.out.println("Contains Java? " + list.contains("Java"));

	        // indexOf()
	        System.out.println("Index of HTML: " + list.indexOf("HTML"));

	        // lastIndexOf()
	        list.add("Java");
	        System.out.println("Last Index of Java: " + list.lastIndexOf("Java"));

	        // size()
	        System.out.println("Size: " + list.size());

	        // isEmpty()
	        System.out.println("Is Empty? " + list.isEmpty());

	        // remove(index)
	        list.remove(1);
	        System.out.println("After remove(index): " + list);

	        // remove(object)
	        list.remove("CSS");
	        System.out.println("After remove(object): " + list);

	        // iterator()
	        System.out.print("Iterator: ");
	        Iterator<String> it = list.iterator();
	        while(it.hasNext()){
	            System.out.print(it.next()+" ");
	        }

	        System.out.println();

	        // subList()
	        System.out.println("SubList: " + list.subList(0,2));

	        // toArray()
	        Object arr[] = list.toArray();

	        System.out.print("Array: ");
	        for(Object x : arr){
	            System.out.print(x+" ");
	        }

	        System.out.println();

	        // clear()
	        list.clear();
	        System.out.println("After clear(): " + list);

	        // isEmpty()
	        System.out.println("Is Empty: " + list.isEmpty());
	    }
	}

