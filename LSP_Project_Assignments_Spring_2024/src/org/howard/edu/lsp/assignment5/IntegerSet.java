package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * The IntegerSet class represents a set of integers.
 */
public class IntegerSet {
    /** Store the set elements in an ArrayList. */
    private List<Integer> set = new ArrayList<>();

    /** Default Constructor. */
    public IntegerSet() {
    }

    /**
     * Constructor if you want to pass in an already initialized set.
     *
     * @param set the set to initialize
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /** Clears the internal representation of the set. */
    public void clear() {
       set.clear();
    }

    /**
     * Returns the length of the set.
     *
     * @return the length of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal.
     * Two sets are equal if they contain all of the same values in ANY order.
     *
     * @param o the object to compare
     * @return true if the sets are equal, false otherwise
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof IntegerSet))
            return false;
        IntegerSet other = (IntegerSet) o;
        return this.set.containsAll(other.set) && other.set.containsAll(this.set);
    }

	/**
     * Checks if the set contains a specific value.
     *
     * @param value the value to check for
     * @return true if the set contains the value, otherwise false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * Throws a IntegerSetException if the set is empty.
     *
     * @return the largest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int largest() {
        if (set.isEmpty())
            throw new IntegerSetException("IntegerSetException: Set is empty");
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    /**
     * Returns the smallest item in the set.
     * Throws a IntegerSetException if the set is empty.
     *
     * @return the smallest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty())
            throw new IntegerSetException("IntegerSetException: Set is empty");
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    /**
     * Adds an item to the set if it's not already there.
     *
     * @param item the item to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it exists.
     *
     * @param item the item to remove
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs a union operation with another IntegerSet.
     *
     * @param intSetb the IntegerSet to union with
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs an intersection operation with another IntegerSet.
     *
     * @param intSetb the IntegerSet to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs a set difference operation with another IntegerSet.
     *
     * @param intSetb the IntegerSet to subtract
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Computes the complement of the set with another IntegerSet.
     *
     * @param intSetb the IntegerSet to complement with
     */
    public void complement(IntegerSet intSetb) {
        ArrayList<Integer> complement = new ArrayList<>();
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i) && !intSetb.set.contains(i)) {
                complement.add(i);
            }
        }
        set = complement;
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns the String representation of the set.
     *
     * @return the String representation of the set
     */
    public String toString() {
        return set.toString();
    }

    /** Custom exception for IntegerSet. */
    /**
     * 
     */
    public static class IntegerSetException extends RuntimeException {
        public IntegerSetException(String message) {
            super(message);
        }
    }
}