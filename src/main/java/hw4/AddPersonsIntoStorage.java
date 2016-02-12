package hw4;

import static hw4.Validator.errorMessage;
import static hw4.Validator.isValidAge;
import static hw4.Validator.isValidName;

public class AddPersonsIntoStorage {

    public static void main(String args[]) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();

        System.out.println("Enter FIVE people for our intStorage. Valid name - three chars, Valid age from 1 to 120");

        while (!container.isFull()) {

            String name = readInput.readName();
            int age = readInput.readAge();

            if (isValidName(name) & isValidAge(age)) {
                 Person person = new Person(name, age);
                 container.add(person);
                 System.out.println("-----\nPerson "+ person + " was successfully added into the Storage\n-----");
            } else {
                 System.out.println(errorMessage());
            }
        }

        System.out.println("\nOur intStorage is full!\n-----");
        System.out.println(container);
    }
}
