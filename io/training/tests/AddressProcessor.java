package io.training.tests;

public class AddressProcessor {

    public static void printCity(Person person) {
        System.out.println(" Person: " + person.getName() );
        person.getAddressList().forEach(address -> {
            System.out.println( "    City: "+  address.getCity() );
        });
    }
}
