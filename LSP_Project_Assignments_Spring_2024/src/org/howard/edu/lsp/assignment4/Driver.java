package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		 ArrayList<Integer> initialSet = new ArrayList<>();
	        initialSet.add(3);
	        initialSet.add(1);
	        initialSet.add(4);
	        
	        IntegerSet setA = new IntegerSet(initialSet);
	        System.out.println("Set A: " + setA);

	        setA.add(2);
	        setA.add(3);
	        System.out.println("After adding 2 and 3 to Set A: " + setA);

	        System.out.println("Length of Set A: " + setA.length());

	        IntegerSet setB = new IntegerSet();
	        setB.add(3);
	        setB.add(5);
	        setB.add(2);
	        System.out.println("Set B: " + setB);

	        setA.union(setB);
	        System.out.println("Union of Set A and Set B: " + setA);

	        setA.intersect(setB);
	        System.out.println("Intersection of Set A and Set B: " + setA);

	        setA.diff(setB);
	        System.out.println("Difference of Set A and Set B: " + setA);

	        System.out.println("Is Set A empty? " + setA.isEmpty());

	        System.out.println("Smallest item in Set A: " + setA.smallest());
	        System.out.println("Largest item in Set A: " + setA.largest());
	    }
	}
