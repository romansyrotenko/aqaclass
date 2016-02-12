package hw4;

import static hw4.Validator.*;

public class AddPersonsIntoStorage {

    public static void main(String args[]) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();

        System.out.println("Enter FIVE people for our intStorage. Valid name - three chars, Valid age from 1 to 120");

        while (!container.isFull()) {

            String name = readInput.readName();
            int age = readInput.readAge();
            Person person = new Person(name, age);
            if (isValidPerson(person)) {
                 container.add(person);
            }
        }

        System.out.println(container);
    }
}
