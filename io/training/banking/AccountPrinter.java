package io.training.banking;

public class AccountPrinter {

    public static void print( Printeable printeable ) {
        System.out.println( "DATA: " + printeable.printableInfo() );
    }
}
