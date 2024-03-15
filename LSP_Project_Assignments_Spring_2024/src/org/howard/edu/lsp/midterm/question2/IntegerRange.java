package org.howard.edu.lsp.midterm.question2;


/**
 * Represents a range of integers defined by lower and upper bounds.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with specified lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range (inclusive)
     * @param upperBound the upper bound of the range (inclusive)
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the range contains the given value.
     *
     * @param value the value to check for containment
     * @return true if the value is within the range, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to check for overlap
     * @return true if there is at least one common value, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        return !(this.upperBound < other.min() || this.lowerBound > other.max());
    }

    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    @Override
    public int size() {
        return upperBound - lowerBound + 1;
    }

    /**
     * Returns the lower bound of the range.
     *
     * @return the lower bound
     */
    public int min() {
        return lowerBound;
    }

    /**
     * Returns the upper bound of the range.
     *
     * @return the upper bound
     */
    public int max() {
        return upperBound;
    }

    /**
     * Checks if this range is equal to another range.
     * Two ranges are equal if their lower and upper bounds are the same.
     *
     * @param obj the object to compare
     * @return true if the ranges are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }

    /**
     * A simple tester class to test the methods of IntegerRange.
     */
    public static class RangeTester {
        public static void main(String[] args) {
            IntegerRange range1 = new IntegerRange(1, 10);
            IntegerRange range2 = new IntegerRange(5, 15);

            System.out.println("Range 1 contains 5: " + range1.contains(5));
            System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2));
            System.out.println("Size of Range 1: " + range1.size());
            System.out.println("Range 1 equals Range 2: " + range1.equals(range2));
        }
    }
}

