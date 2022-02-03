package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(RegularShapeType type){
        Shape shape = null;
        switch(type){
            case Triangle:
                shape = Triangle.getShape();
                break;
            case Quadrilateral:
                shape = Quadrilateral.getShape();
                break;
            case Pentagon:
                shape = Pentagon.getShape();
                break;
            case Hexagon:
                shape = Hexagon.getShape();
                break;
        }
        return shape;
    }
}
