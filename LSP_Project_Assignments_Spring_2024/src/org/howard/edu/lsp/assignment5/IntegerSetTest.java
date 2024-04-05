package org.howard.edu.lsp.assignment5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class IntegerSetTest {
    
    private IntegerSet setA;
    private IntegerSet setB;
    
    @Before
    public void setUp() {
        setA = new IntegerSet();
        setB = new IntegerSet();
    }
    
    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        setA.add(1);
        setA.clear();
        assertTrue(setA.isEmpty());
    }
    
    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        setA.add(1);
        setA.add(2);
        assertEquals(2, setA.length());
    }
    
    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        setA.add(1);
        setA.add(2);
        
        setB.add(2);
        setB.add(1);
        
        assertTrue(setA.equals(setB));
    }
    
    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        setA.add(1);
        assertTrue(setA.contains(1));
    }
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() {
        setA.add(1);
        setA.add(5);
        setA.add(3);
        assertEquals(5, setA.largest());
    }
    
    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() {
        setA.add(1);
        setA.add(5);
        setA.add(3);
        assertEquals(1, setA.smallest());
    }
    
    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        setA.add(1);
        assertTrue(setA.contains(1));
    }
    
    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        setA.add(1);
        setA.remove(1);
        assertFalse(setA.contains(1));
    }
    
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        setA.add(1);
        setB.add(2);
        setA.union(setB);
        assertTrue(setA.contains(1) && setA.contains(2));
    }
    
    @Test
    @DisplayName("Test case for intersection")
    public void testIntersect() {
        setA.add(1);
        setA.add(2);
        setB.add(2);
        setB.add(3);
        setA.intersect(setB);
        assertTrue(setA.contains(2) && !setA.contains(1) && !setA.contains(3));
    }
    
    @Test
    @DisplayName("Test case for difference")
    public void testDiff() {
        setA.add(1);
        setA.add(2);
        setB.add(2);
        setB.add(3);
        setA.diff(setB);
        assertTrue(setA.contains(1) && !setA.contains(2) && !setA.contains(3));
    }
    
    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        setA.add(1);
        setA.add(2);
        setB.add(2);
        setB.add(3);
        setA.complement(setB);
        assertTrue(setA.contains(3) && !setA.contains(1) && !setA.contains(2));
    }
    
    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(setA.isEmpty());
    }
    
    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        setA.add(1);
        setA.add(2);
        assertEquals("[1, 2]", setA.toString());
    }
}

