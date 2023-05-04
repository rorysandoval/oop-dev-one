package io.training.idp;

import java.util.List;

public class DieselEngine implements Engine {

    private String fuelType;
    private String bujias;
    private List<String> rodamientos;

    private Carburador carburador;


    public DieselEngine() {
    }

    public DieselEngine(String fuelType, String bujias, List<String> rodamientos, Carburador carburador) {
        this.fuelType = fuelType;
        this.bujias = bujias;
        this.rodamientos = rodamientos;
        this.carburador = carburador;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
