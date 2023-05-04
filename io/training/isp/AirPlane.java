package io.training.isp;

public class AirPlane extends AbstractVehicle implements CanFly {

    public AirPlane() {
    }

    @Override
    public void fly() {
    }

    @Override
    public boolean canFly() {
        return true;
    }
}
