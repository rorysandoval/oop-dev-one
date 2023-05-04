package io.training.isp;

public class AbstractVehicle implements Vehicule {
    @Override
    public void start() {
    }

    @Override
    public void stop() {
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
