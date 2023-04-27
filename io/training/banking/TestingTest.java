package io.training.banking;

public class TestingTest {

    public static void main( String[] args ) {
        BankAccount accountOne = new SavingsAccount( 100.00, 0.05 );
        BankAccount accountTwo = new CheckingsAccount( 200.00, 10.0 );

        BankAccount accountDemo = new SavingsAccount( 500.00, 0.03 );
        BankAccount accountTest = new CheckingsAccount( 700.00, 200.0 );

        ExternalAcount external = new ExternalAcount( "Canada","CAD", 55500.00 );



        AccountPrinter.print( accountOne );
        AccountPrinter.print( accountDemo );
        AccountPrinter.print( accountTwo );

        AccountPrinter.print( external );


        // Account One
//        accountOne.deposit( 50.0 );
//        System.out.println( accountOne.getBalance() );
//
//        accountOne.withdraw( 70.0 );
//        System.out.println( accountOne.getBalance() );
//
//        accountOne.withdraw( 700.0 );
//        System.out.println( accountOne.getBalance() );
//
//        // Account Two
//        accountTwo.deposit( 80.0 );
//        System.out.println( accountTwo.getBalance() );
//
//        accountTwo.withdraw( 100.0 );
//        System.out.println( accountTwo.getBalance() );
//
//        accountTwo.withdraw( 800.0 );
//        System.out.println( accountTwo.getBalance() );

    }
}
