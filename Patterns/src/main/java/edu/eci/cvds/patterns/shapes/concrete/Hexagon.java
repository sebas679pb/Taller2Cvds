package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape {
    public int getNumberOfEdges() {
        return 6;
    }

    public static Shape getShape(){
        return new Hexagon();
    }
}