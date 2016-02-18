package hw5;

import static hw5.Validator.*;

public class PersonsStorage {

    public static void main(String args[]) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();
        Menu menu = new Menu(readInput);
        int menuItem = 0;

        System.out.println("-----\nWelcome to Persons Storage app! What do you want to do?\n-----");

        while (menuItem != 3) {
            menu.mainMenu();
            menuItem = menu.readMenuItem();

            if (menuItem == 1) {
                System.out.println("Add person");
                String name = readInput.readName();
                int age = readInput.readNumber("age");
                Person person = new Person(name, age);
                if (isValidPerson(person)) {
                    container.add(person);
                }

            } else if (menuItem == 2) {
                System.out.println("Search person:");
                String searchName = readInput.readName();
                int tempCounter = Container.getCounter();
                Container.setCounter(0);
                System.out.println(container.findPerson(searchName));
                Container.setCounter(tempCounter);
            }
        }
        System.out.println("Exiting ...");
    }

}
