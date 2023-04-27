package io.training.tests;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public static String DEFAULT_NAME = "";
    public static Integer DEFAULT_AGE = -1;

    private String name = DEFAULT_NAME;
    private Integer age = DEFAULT_AGE;

    private List<Address> addressList = new ArrayList<>();

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
