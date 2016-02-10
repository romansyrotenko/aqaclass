package hw4;

public class AddPersonsIntoStorage {

    public static void main(String args[]) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();

        System.out.println("Enter FIVE people for our intStorage. Valid name - three chars, Valid age from 1 to 120");

        while (!container.isFull()) {

            Person person = new Person();
            String name;
            int age;

            do {
                System.out.println("Enter name:");
                name = readInput.readName();
                if (!Validator.isValidName(name)) {
                    System.out.println("Name " + name + " isn't valid! Enter Valid name!");
                }
                else {
                    person.setName(name);
                    break;
                }
            } while (true);

            do {
                System.out.println("Enter " + name + "'s age:");
                age = readInput.readAge();
                if (!Validator.isValidAge(age)) {
                    System.out.println("Age " + age + " isn't valid! Enter Valid age!");
                }
                else {
                    person.setAge(age);
                    break;
                }
            } while (true);

            container.add(person);
            System.out.println("-----");
            System.out.println("Person "+ person + " was successfully added into the Storage");
        }

        System.out.println("Our intStorage is full!");
        System.out.println("-----");
        System.out.println(container);

    }

}
