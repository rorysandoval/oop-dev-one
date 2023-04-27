package io.training.banking;

public abstract class BankAccount implements Printeable {
    private Double balance;

    public BankAccount( Double balance ) {
        this.balance = balance;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance( Double balance ) {
        this.balance = balance;
    }

    public void deposit( Double amount ) {
        Double depositBalance = getBalance() + amount;
        setBalance( depositBalance );
    }

    public abstract void withdraw( Double amount );

    public abstract String printableInfo();
}
