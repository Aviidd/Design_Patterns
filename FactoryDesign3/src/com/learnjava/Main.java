package com.learnjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Scanner scn = new Scanner(System.in);
        System.out.println("enter the name of shape");

        String shapeName = scn.nextLine();

        Shape shape = shapeFactory.getShape(shapeName);
    }
}
