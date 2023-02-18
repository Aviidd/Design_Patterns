package com.learnjava;

public class ShapeFactory {
    public Shape getShape(String ShapeName){
        if(ShapeName == null){
            return null;
        }
        if(ShapeName.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if(ShapeName.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(ShapeName.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
