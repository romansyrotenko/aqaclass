package hw7;

import static hw7.Storage.print;
import static hw7.Validator.isValidPerson;

public class PersonService implements Service {

    Storage storage = new Storage();

    public void save(Person person) {

        if (!storage.isFull() && isValidPerson(person)) {
                storage.add(person);
                System.out.println("-----\nPerson " + person + " was successfully added into the Storage\n-----");
        } else if (storage.isFull()) {
            System.out.println("Can't add new person. The Storage is full!");
        }
    }

    public Storage findByName(String name) {
        return storage.findPersonByName(name);
    }

    public Storage findByEmail(String email) {
        return storage.findPersonByEmail(email);
    }

    public void printStorage() {
        print(storage);
    }


}
