package xyz.grishaev.util;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by alximik on 16/02/16.
 */
public class PriorityQueueImplTest extends TestCase {

    PriorityQueue priorityQueue = new PriorityQueueImpl();

    public void testSize() throws Exception {
        Assert.assertEquals(0,priorityQueue.size());
    }

    public void testInsert() throws Exception {
        priorityQueue.insert(1);
        priorityQueue.insert(2);
        Assert.assertEquals(2, priorityQueue.size());
    }

    public void testPopMax() throws Exception {
        priorityQueue.insert(1);
        priorityQueue.insert(2);
        Assert.assertEquals(2, priorityQueue.popMax());
    }
}