package xyz.grishaev.core;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by alximik on 16/02/16.
 */
public class PrinterImplTest extends TestCase {
    Printer printer = new PrinterImpl();

    public void testAsSortedString() throws Exception {
        Assert.assertEquals("3,2,1",printer.asSortedString(1,2,3));
    }

    public void testAsSortedStringZeroSize() throws Exception {
        Assert.assertEquals("",printer.asSortedString());
    }

}