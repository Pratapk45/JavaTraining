package com.java.arrays;

public class CountDuplicateElement {
	
	    public static void main(String[] args) {

	        int[] A = {1, 6, 3, 1, 2, 6, 1, 3, 1, 6, 1, 3};

	        boolean[] B = new boolean[A.length];

	        for (int i = 0; i < A.length; i++) {

	            if (B[i]) {
	                continue;
	            }

	            int count = 1;

	            for (int j = i + 1; j < A.length; j++) {
	                if (A[i] == A[j]) {
	                    count++;
	                    B[j] = true;
	                }
	            }

	            if (count > 1) {
	                System.out.println(A[i] + " is repeated " + count + " times");
	            }
	        }
	    }
	

}
