package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Pentagon implements Shape {
    public int getNumberOfEdges() {
        return 5;
    }

    public static Shape getShape(){
        return new Pentagon();
    }
}