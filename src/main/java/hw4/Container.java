package hw4;

import java.util.Arrays;

public class Container {

    Person[] array = new Person[5];
    static int counter = 0;

    public void add(Person person) {
        array[counter] = person;
        counter++;
        System.out.println("-----\nPerson "+ person + " was successfully added into the Storage\n-----");
    }

    public boolean isFull() {
        return array.length <= counter;
    }

    @Override
    public String toString() {
        System.out.println("\nOur intStorage is full!\n-----");
        return "Storage{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

}
