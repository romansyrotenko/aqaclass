package hw5;

public class PersonsStorage {

    public static void main(String args[]) {

        Service personService = new PersonService();
        ReadInput readInput = new ReadInput();
        Menu menu = new Menu(readInput);
        int menuItem = 0;

        while (menuItem != 3) {
            menu.mainMenu();
            menuItem = menu.readMenuItem();

            if (menuItem == 1) {
                System.out.println("Add person:");
                String name = readInput.readName();
                int age = readInput.readNumber("age");
                Person person = new Person(name, age);
                personService.save(person);

            } else if (menuItem == 2) {
                System.out.println("Search person:");
                String searchName = readInput.readName();
                int tempCounter = Storage.getAddCounter();
                Storage.setAddCounter(0);
                Storage.printSearchResults(personService.findByName(searchName));
                Storage.setAddCounter(tempCounter);
            }
        }
        System.out.println("Exiting ...");
    }



}
