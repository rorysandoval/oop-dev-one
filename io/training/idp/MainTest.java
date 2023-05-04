package io.training.idp;

public class MainTest {

    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.heatMotor();
        car.turnOff();
    }

}
