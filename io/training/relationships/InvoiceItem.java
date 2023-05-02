package io.training.relationships;

public class InvoiceItem {
    private Integer id;

    // many-to-one
    private Invoice invoice;
    // many-to-one
    private Product product;

    private Double amount;
    private Integer count;
}
