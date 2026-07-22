package com.java.list;
import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {

	    public static void main(String[] args) {

	        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 50, 60, 10);

	        System.out.println("Original List : " + numbers);

	        // 1. filter()
	        System.out.println("\n1. Even Numbers");
	        numbers.stream()
	                .filter(n -> n % 2 == 0)
	                .forEach(System.out::println);

	        // 2. map()
	        System.out.println("\n2. Multiply by 2");
	        numbers.stream()
	                .map(n -> n * 2)
	                .forEach(System.out::println);

	        // 3. sorted()
	        System.out.println("\n3. Ascending Order");
	        numbers.stream()
	                .sorted()
	                .forEach(System.out::println);

	        // 4. sorted() Descending
	        System.out.println("\n4. Descending Order");
	        numbers.stream()
	                .sorted(Comparator.reverseOrder())
	                .forEach(System.out::println);

	        // 5. distinct()
	        System.out.println("\n5. Distinct Elements");
	        numbers.stream()
	                .distinct()
	                .forEach(System.out::println);

	        // 6. limit()
	        System.out.println("\n6. First 3 Elements");
	        numbers.stream()
	                .limit(3)
	                .forEach(System.out::println);

	        // 7. skip()
	        System.out.println("\n7. Skip First 3 Elements");
	        numbers.stream()
	                .skip(3)
	                .forEach(System.out::println);

	        // 8. count()
	        System.out.println("\n8. Count");
	        System.out.println(numbers.stream().count());

	        // 9. collect()
	        System.out.println("\n9. Collect Even Numbers");
	        List<Integer> even = numbers.stream()
	                .filter(n -> n % 2 == 0)
	                .collect(Collectors.toList());
	        System.out.println(even);

	        // 10. findFirst()
	        System.out.println("\n10. First Element");
	        System.out.println(numbers.stream().findFirst().get());

	        // 11. anyMatch()
	        System.out.println("\n11. Any Number > 50");
	        System.out.println(numbers.stream().anyMatch(n -> n > 50));

	        // 12. allMatch()
	        System.out.println("\n12. All Numbers > 5");
	        System.out.println(numbers.stream().allMatch(n -> n > 5));

	        // 13. noneMatch()
	        System.out.println("\n13. No Negative Number");
	        System.out.println(numbers.stream().noneMatch(n -> n < 0));

	        // 14. max()
	        System.out.println("\n14. Maximum");
	        System.out.println(numbers.stream().max(Integer::compare).get());

	        // 15. min()
	        System.out.println("\n15. Minimum");
	        System.out.println(numbers.stream().min(Integer::compare).get());

	        // 16. reduce()
	        System.out.println("\n16. Sum");
	        System.out.println(numbers.stream().reduce(0, Integer::sum));

	        // 17. forEach()
	        System.out.println("\n17. forEach()");
	        numbers.stream()
	               .forEach(System.out::println);
	    }

}
