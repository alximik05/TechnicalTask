package xyz.grishaev;

import xyz.grishaev.core.Printer;
import xyz.grishaev.core.PrinterImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Printer printer = new PrinterImpl();
        printer.asSortedString(15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2, 15, 7, 4, 1, 7, 2);
    }
}