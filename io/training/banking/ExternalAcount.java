package io.training.banking;

public class ExternalAcount implements Printeable {
    private String country;
    private String currency;

    private Double balance;


    public ExternalAcount( String country, String currency, Double balance ) {
        this.country = country;
        this.currency = currency;
        this.balance = balance;
    }

    @Override
    public String printableInfo() {
        return " Balance :" + balance + ", Country: " + country + ", Currenty: " + currency;
    }
}
