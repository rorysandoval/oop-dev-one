package io.training.isp;

public class PrintCanFlyOnly {
    public static void printCanFlyOnly(Vehicule vehicule) {
        if (vehicule.canFly())
            System.out.println(" Yes it can Fly!");
        else
            System.out.println(" Can not can Fly!");
    }
}
