package io.training.isp;

public class MainTest {

    public static void main(String[] args) {
        Vehicule vUno = new Boat();
        Vehicule vDos = new AirPlane();
        Vehicule vTres = new Car();

        PrintCanFlyOnly.printCanFlyOnly(vTres);


    }


}
