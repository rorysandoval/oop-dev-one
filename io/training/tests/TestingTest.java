package io.training.tests;

import java.util.List;

public class TestingTest {
    public static void main(String[] args) {
        System.out.println("Testing...");

//        List<Person> personList = PersonFactory.findPersonList();
//
//        personList.forEach(person -> {
//            AddressProcessor.printCity(person);
//        });


        Empleado empleado = new Empleado();
        empleado.setName("Juan");
        empleado.getAddressList().add(new Address("calle mendiola","santa cruz"));


        AddressProcessor.printCity( empleado );


        System.out.println("Done.");
    }
}
