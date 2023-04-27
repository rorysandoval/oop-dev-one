package io.training.poly;

public class Person implements CanSayHello {

    private String name;
    private String age;

    @Override
    public void sayHello() {
        System.out.println(" The PERSON says HELLO!");
    }

    // other methods can be used.
}
