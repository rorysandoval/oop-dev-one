package io.training.relationships;

import java.util.List;

public class Customer {
    private Integer id;
    private String code;
    private String name;
    // assosiation  ( one-to-many )
    private List<Invoice> invoiceList;

    public Customer(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
}
