package io.training.srp;

public class CustomerRepository {

    Customer findCustomer(Integer customerId) {
//        DBConnection conn = Coonneciton.open("localhost:333", "user", "password");
//        Customer data = conn.execute("SELEC * FROM table_customer wHERE id = " + id );
//        conn.close();
        return new Customer();
    }

}
