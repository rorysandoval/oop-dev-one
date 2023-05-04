package io.training.idp;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void heatMotor() {
        // check electrical circuits
        engine.start();
        // do something else.
    }

    public void turnOff() {
        engine.stop();
        // do something else
        // release locks.
    }
}
