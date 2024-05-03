package org.howard.edu.lsp.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.*;

public class ShapeFactoryTest {
    private ShapeFactory shapeFactory;

    @Before
    public void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testCreateCircle() {
        Shape circle = shapeFactory.createShape("circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shape rectangle = shapeFactory.createShape("rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }

    @Test
    public void testInvalidShape() {
        Shape invalid = shapeFactory.createShape("triangle");
        assertNull(invalid);
    }
}