package io.training.ocp;

public class Triangle extends Shape {

    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calcArea() {
        return base * height / 2;
    }
}
