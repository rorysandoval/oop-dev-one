package io.training.tests;

import java.util.List;

public class PersonFactory {

    public static List<Person> findPersonList() {
        Person juan = new Person("juan", 10);
        juan.setAddressList( List.of() );

        Person pedro = new Person();
        pedro.setName("pedro");

        Person jose = new Person();

        return List.of(juan, pedro, jose);
    }
}
