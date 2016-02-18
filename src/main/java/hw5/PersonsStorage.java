package hw5;

import static hw5.Validator.*;

public class PersonsStorage {

    public static void main(String args[]) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();
        Menu menu = new Menu();
        int menuItem;

        System.out.println("-----\nWelcome to Persons Storage app! What do you want to do?\n-----");

        do {
            menu.mainMenu();
            menuItem = readInput.readNumber("menu item");
            if (isValidMenuItem(menuItem)) {
                if (menuItem == 1) {
                    System.out.println("Enter FIVE people for our intStorage. Valid name - three chars, Valid age from 1 to 120");

                    while (!container.isFull()) {
                        String name = readInput.readName();
                        int age = readInput.readNumber("Age");
                        Person person = new Person(name, age);
                        if (isValidPerson(person)) {
                            container.add(person);
                        }
                    }
                    System.out.println(container);

                } else if (menuItem == 2) {
                    System.out.println("Enter name for search...");
                    String searchName = readInput.readName();
                    System.out.println(container.findPerson(searchName));
                }
            }
        } while (menuItem != 3);



        }

}
