package io.training.ocp;

public class Rectangle extends Shape {
    private Double width;
    private Double height;


    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calcArea() {
        return width * height;
    }
}
