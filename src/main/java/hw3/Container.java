package hw3;

import java.util.Arrays;

public class Container {

    int[] array = new int[10];
    static int counter = 0;

    public void add(int value) {
        array[counter] = value;
        counter++;
    }

    public boolean isFull() {
        return array.length <= counter;
    }

    @Override
    public String toString() {
        return "Storage {" +
                "array=" + Arrays.toString(array) +
                "}";
    }
}

