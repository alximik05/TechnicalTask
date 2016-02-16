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

    public void insert(Comparable element) {
        if (size == array.length) {
            resize();
        }
        array[size] = element;
        size++;
    }

    private void resize() {
        Comparable[] newArray = new Comparable[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    private int indexOfMax() {
            // Search through the entire array for the smallest element.
            int max = 0;
            for (int i = 1; i < size; i++) {
                // If the current smallest is greater than the element at index i,
                // then make the element at index i the new smallest.
                if (array[max].compareTo(array[i]) < 0)
                    max = i;
            }
            return max;
    }

    // Return true if the queue is empty, false if not empty.
    public boolean isEmpty() {
        return size <= 0;
    }

    public Comparable popMax() {
        int largest = indexOfMax();    // index of the element with the max key
        Comparable maxElement = array[largest];  // the actual element

        // Move the element in the last position to this position.
        array[largest] = array[size-1];

        // We no longer have an element in that last position.
        size--;
        array[size] = null;

        // Return the element with the minimum key.
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
