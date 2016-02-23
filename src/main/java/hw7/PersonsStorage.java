package hw7;

public class PersonsStorage {

    public static void main(String args[]) {

        Service personService = new PersonService();
        ReadInput readInput = new ReadInput();
        Menu menu = new Menu(readInput);
        int menuItem = -1;

        while (menuItem != Menu.MENUEXITITEM) {
            menuItem = menu.mainMenu();
            if (menuItem == 1) {
                System.out.println("Add person:");
                String name = readInput.readString("name");
                int age = readInput.readNumber("age");
                String email = readInput.readString("email");
                Person person = new Person(name, age, email);
                personService.save(person);

            } else if (menuItem == 2) {
                System.out.println("Search person by name:");
                String searchName = readInput.readString("name");
                int tempCounter = Storage.getAddCounter();
                Storage.setAddCounter(0);
                Storage.printSearchResults(personService.findByName(searchName));
                Storage.setAddCounter(tempCounter);

            } else if (menuItem == 3) {
                System.out.println("Search person by email:");
                String searchEmail = readInput.readString("email");
                int tempCounter = Storage.getAddCounter();
                Storage.setAddCounter(0);
                Storage.printSearchResults(personService.findByEmail(searchEmail));
                Storage.setAddCounter(tempCounter);
            } else if (menuItem == 99) {
                System.out.println("Current Storage:");
                personService.printStorage();
            }
        }
        System.out.println("Exiting ...");
    }

}
