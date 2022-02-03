package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Quadrilateral implements Shape {
    public int getNumberOfEdges() {
        return 4;
    }

    public static Shape getShape(){
        return new Quadrilateral();
    }
}