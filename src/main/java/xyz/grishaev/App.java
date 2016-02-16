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
        System.out.println(printer.asSortedString(1));
    }
}
