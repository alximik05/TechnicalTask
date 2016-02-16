package xyz.grishaev.core;

import xyz.grishaev.util.PriorityQueue;
import xyz.grishaev.util.PriorityQueueImpl;

import java.util.Arrays;


/**
 * Created by USER on 16.02.2016.
 */
public class PrinterImpl implements Printer {
     PriorityQueueImpl pq;

    public PrinterImpl() {
        pq = new PriorityQueueImpl();
    }
    
    public <T extends Comparable<T>> String asSortedString(T... values) {
        for (int i = 0; i < values.length; i++) {
            pq.insert(values[i]);
        }
        System.out.println(Arrays.toString(pq.getArray()));
        String str = new String();

        while (!pq.isEmpty()) {
            System.out.println(pq.popMax());
            System.out.println("соталось " + pq.size());
            System.out.println(Arrays.toString(pq.getArray()));
        }
        return null;
    }
}
