package org.howard.edu.lsp.oopfinal.question3;

public class Client {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape c = shapeFactory.createShape("circle");
        c.draw();

        Shape r = shapeFactory.createShape("rectangle");
        r.draw();
    }
}