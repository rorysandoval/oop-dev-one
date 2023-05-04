package io.training.ocp;

import java.awt.geom.Area;

public class Circle extends Shape {

    private Double ratio;


    public Circle(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    public Double calcArea() {
        return ratio * 3.1416;
    }
}
