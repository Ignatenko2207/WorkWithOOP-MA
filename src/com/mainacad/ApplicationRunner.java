package com.mainacad;


import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.treangle.Treangle;

import java.util.ArrayList;
import java.util.List;

public class ApplicationRunner {

    public static void main(String[] args) {

        Treangle treangle1 = new Treangle(15, 20);
        Treangle treangle2 = new Treangle(20, 15);

        Circle circle = new Circle(100);

        Square square = new Square();
        square.setSide(28);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(treangle1);
        shapes.add(treangle2);
        shapes.add(square);
        shapes.add(circle);


        Shape maxShape = shapes.get(0);
        for (int i = 1; i < shapes.size() ; i++) {
            if (maxShape.getArea() < shapes.get(i).getArea()) {
                maxShape = shapes.get(i);
            }
        }


        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());


    }

}
