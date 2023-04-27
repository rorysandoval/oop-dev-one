package io.training.banking;

public class SavingsAccount extends BankAccount {

    private Double interestRate;

    public SavingsAccount( Double balance, Double interestRate ) {
        super( balance );
        this.interestRate = interestRate;
    }

    @Override
    public void deposit( Double amount ) {
        super.deposit( amount );
        addInterest();
    }

    public void addInterest() {
        Double calculatedBalance = getBalance() * (1 + interestRate);
        setBalance( calculatedBalance );
    }

    @Override
    public void withdraw( Double amount ) {
        Double withdrawBalance = getBalance() - amount;
        if ( withdrawBalance < 0.0 ) {
            System.out.println( "Estas yesca!" );
            return;
        }
        setBalance( withdrawBalance );
    }

    @Override
    public String printableInfo() {
        return "Balance: " + getBalance() + ", Interest:  " + interestRate;
    }


}
