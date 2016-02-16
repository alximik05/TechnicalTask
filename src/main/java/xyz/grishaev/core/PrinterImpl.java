package xyz.grishaev.core;

import xyz.grishaev.util.PriorityQueueImpl;


/**
 * Created by USER on 16.02.2016.
 */
public class PrinterImpl implements Printer {
     PriorityQueueImpl pq;

    public PrinterImpl() {
        pq = new PriorityQueueImpl();
    }
    
    public <T extends Comparable<T>> String asSortedString(T... values) {
        if (values.length > 0) {


            for (T value : values) {
                pq.insert(value);
            }
            StringBuilder str = new StringBuilder();
            while (!pq.isEmpty()) {
                str.append(pq.popMax()).append(",");
//            System.out.println(pq.popMax());
            }
            System.out.println("============" + str.lastIndexOf(","));
            str.deleteCharAt(str.lastIndexOf(","));
            return str.toString();
        } else return "";
    }
}
