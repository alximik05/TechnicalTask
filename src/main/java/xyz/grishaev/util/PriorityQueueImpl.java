package xyz.grishaev.util;

/**
 * Created by USER on 16.02.2016.
 */
public class PriorityQueueImpl implements PriorityQueue {

    private Comparable[] array;
    private int size;

    public PriorityQueueImpl() {
        this.array = new Comparable[16];
        this.size = 0;
    }

    public int size() {
        return size;
    }


    public synchronized void insert(Comparable element) {
        if (size == array.length) {
            resize();
        }
        array[size] = element;
        size++;
    }

    private synchronized void resize() {
        Comparable[] newArray = new Comparable[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    private synchronized int indexOfMax() {
            int max = 0;
            for (int i = 1; i < size; i++) {
                if (array[max].compareTo(array[i]) < 0)
                    max = i;
            }
            return max;
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    public Comparable popMax() {
        int largest = indexOfMax();
        Comparable maxElement = array[largest];
        array[largest] = array[size-1];
        size--;
        array[size] = null;
        return maxElement;
    }


    public void printElements() {
        for (Comparable a : array) {
            System.out.println(a);
        }
    }

    public Comparable[] getArray() {
        return array;
    }

    public void setArray(Comparable[] array) {
        this.array = array;
    }
}
