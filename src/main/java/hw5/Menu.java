package hw5;

public class Menu {

    ReadInput readInput;

    Menu(ReadInput readInput) {
        this.readInput = readInput;
    }

    public void mainMenu() {

        System.out.println("\n-----" +
                           "\n1 - Add new Person" +
                           "\n2 - Search Persons" +
                           "\n3 - Exit");
    }

    public int readMenuItem() {
        int menuItem;

        do {
           menuItem = readInput.readNumber("menu item");
        } while (!isValidMenuItem(menuItem));
        return menuItem;
    }

    public static boolean isValidMenuItem(int value) {
        if (value > 0 && value < 4) {
            return true;
        } else {
            System.out.println("Please, enter valid menu item\n-----");
            return false;
        }
    }

}
