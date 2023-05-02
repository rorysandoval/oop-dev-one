package io.training.relationships;

import java.util.List;

public class Invoice {
    private Integer id;
    private String number;
    private Double amount;

    // associacion (many-to-one)
    private Customer customer;

    // one-to-many
    private List<InvoiceItem> invoiceItemList;
}
