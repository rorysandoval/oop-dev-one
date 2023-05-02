package io.training.srp;

public class SalaryCalculatorService {

    public Double calcSalary(Employee employee) {
        // calcualte the salary can be base in other parameters and other relatioships
        // DBConnection conn = Coonneciton.open("localhost:333","user","password");
        /// .. calc salary code.
        return employee.getSalary() * 0.25;
    }

}
