package io.training.poly;

public class Duck implements CanSayHello {
    private String color;

    public void swim() {
        System.out.println("Nadando...");
    }

    @Override
    public void sayHello() {
        System.out.println(" The Duck is saying HI!!!");
    }
}
