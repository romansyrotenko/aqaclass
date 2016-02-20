package hw5;

import static hw5.Validator.isValidMenuItem;

public class Menu {

    private ReadInput readInput;

    public Menu(ReadInput readInput) {
        this.readInput = readInput;
    }

    public void mainMenu() {

        System.out.println("\n-----\nWelcome to Persons Storage app! What do you want to do?");
        System.out.println("-----" +
                           "\n1 - Add new Person" +
                           "\n2 - Search Persons" +
                           "\n3 - Exit");
    }

    public int readMenuItem() {

        int menuItem = readInput.readNumber("menu item");
        while (!isValidMenuItem(menuItem)) {
            menuItem = readInput.readNumber("menu item");
        }
        return menuItem;
    }
}
