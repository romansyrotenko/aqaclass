package hw4;

import java.util.Arrays;

public class Container {

    Person[] array = new Person[5];
    static int counter = 0;

    public void add(Person person) {
        array[counter] = person;
        counter++;
    }

    public boolean isFull() {
        return array.length <= counter;
    }

    @Override
    public String toString() {
        return "Container{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
