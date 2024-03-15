package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers.
 */
public interface Range {
    /**
     * Checks if the range contains the given value.
     *
     * @param the value to check for containment
     * @return true if the value is within the range, false otherwise
     */
    boolean contains(int value);

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is at least one common value, false otherwise
     */
    boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    int size();
    
    /**
     * Returns the lower bound of the range.
     *
     * @return the min of the range
     */
    int min();
    
    /**
     * Returns the upper bound of the range.
     *
     * @return the max of the range
     */
    int max();
}
