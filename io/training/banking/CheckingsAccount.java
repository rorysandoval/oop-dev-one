package io.training.banking;

public class CheckingsAccount extends BankAccount {
    private Double creditLimit;

    public CheckingsAccount( Double balance, Double creditLimit ) {
        super( balance );
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw( Double amount ) {
        if ( amount > getBalance() + creditLimit ) {
            System.out.println( "Estas yesca!" );
            return;
        }
        Double withdrawBalance = getBalance() - amount;
        setBalance( withdrawBalance );
    }

    @Override
    public String printableInfo() {
        return "Balance: " + getBalance() + ", Credit: " + creditLimit;
    }
}
