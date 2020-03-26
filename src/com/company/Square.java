package com.company;

public class Square extends GeometricFigure {

    int length = 5;

    @Override
    public void calculateArea() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(" X ");
            }
            System.out.print("\n");
        }

    }
}
