package hw5;

import java.util.Arrays;

public class Container {

    Person[] array = new Person[5];
    static int counter = 0;

    public void add(Person person) {
        if (!isFull()) {
            array[counter] = person;
            counter++;
            System.out.println("-----\nPerson "+ person + " was successfully added into the Storage\n-----");
        } else {
            System.out.println("Can't add new person. The Storage is full!");
        }
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

    public Container findPerson(String name) {

        Container arrayOfFoundPeople = new Container();

        if (array[0] != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && array[i].getName().equals(name)) {
                    arrayOfFoundPeople.add(array[i]);
                }
            }
        } else {
            System.out.println("Nothing to search.... Container is empty....");
        }
        return arrayOfFoundPeople;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Container.counter = counter;
    }
}
