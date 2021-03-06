package hw5;

import java.util.Arrays;

public class Storage {

    Person[] array = new Person[5];
    static int addCounter = 0;

    public void add(Person person) {
            array[addCounter] = person;
            addCounter++;
    }

    public boolean isFull() {
        return array.length <= addCounter;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "array=" + Arrays.toString(array) +
                '}';

    }

    public Storage findPerson(String name) {

        Storage arrayOfFoundPeople = new Storage();

        if (array[0] != null) {
            for (Person person: array) {
                if (person !=null && person.getName().equals(name)) {
                    arrayOfFoundPeople.add(person);
                }
            }
        } else {
            System.out.println("Nothing to search.... Storage is empty....");
        }
        return arrayOfFoundPeople;
    }

    public static int getAddCounter() {
        return addCounter;
    }

    public static void setAddCounter(int addCounter) {
        Storage.addCounter = addCounter;
    }

    public Person[] getArray() {
        return array;
    }

    public static void printSearchResults(Storage storage) {

        Person[] array = storage.getArray();

        if (array[0] != null) {
            System.out.println("There are found people:");
            for (Person person : array) {
                if (person != null) {
                    System.out.println(person);
                }
            }
        } else {
            System.out.println("Nothing found! try again....");
        }
    }
}
