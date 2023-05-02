package io.training.relationships;

public class CustomerFactory {

    public static Customer createCustomer(Integer id, CustomerDto dto) {
        Customer customer = new Customer(id, dto.getCode(), dto.getName());
        // customer.setXXXYYYY
        return customer;
    }


}
