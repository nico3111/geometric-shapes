package com.company;

public class Rectangle extends GeometricFigure{

    int lenghtA = 5;
    int lengthB = 30;

    @Override
    public void calculateArea() {
        for (int i = 0; i < lenghtA; i++) {
            for (int j = 0; j < lengthB; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}
