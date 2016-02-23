package hw7;

import static hw7.Storage.print;
import static hw7.Validator.isValidPerson;

public class PersonService implements Service {

    Storage storage = new Storage();

    public void save(Person person) {

        if (isValidPerson(person)) {
                storage.add(person);
                System.out.println("-----\nPerson " + person + " was successfully added into the Storage\n-----");
        }
    }

    public Storage findByName(String name) {
        return storage.findPersonBy(name);
    }

    public Storage findByEmail(String email) {
        return storage.findPersonBy(email);
    }

    public void printStorage() {
        print(storage);
    }

    public void addPerson(ReadInput readInput) {

        String name = readInput.readString("name");
        int age = readInput.readNumber("age");
        String email = readInput.readString("email");
        Person person = new Person(name, age, email);
        save(person);
    }


}
