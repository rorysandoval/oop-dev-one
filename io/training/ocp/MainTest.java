package io.training.ocp;

public class MainTest {

    public static void main(String[] args) {
        Shape triangle = new Triangle(45.0, 33.0);
        Rectangle rectangle = new Rectangle(566.0, 66.9);
        Circle circle = new Circle(56.4);

        AreaPrinter.printArea(triangle);
        AreaPrinter.printArea(rectangle);
        AreaPrinter.printArea(circle);

    }
}
