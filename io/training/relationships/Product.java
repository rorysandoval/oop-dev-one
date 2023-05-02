package io.training.relationships;

import java.util.List;

public class Product {
    private Integer id;
    private String code;
    private String description;

    // one-to-many
    private List<InvoiceItem> invoiceItemList;

}


//                 ( many-to-many)
// [Invoice] ----> [  InvoiceItem ] -----> [Product]