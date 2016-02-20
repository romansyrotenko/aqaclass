package hw5;

import java.util.Arrays;
import static hw5.Validator.isValidPerson;

public class PersonService implements Service {

    Storage storage = new Storage();

    public void save(Person person) {

        if (!storage.isFull() && isValidPerson(person)) {
                storage.add(person);
                System.out.println("-----\nPerson " + person + " was successfully added into the Storage\n-----");
                System.out.println("Storage " + Arrays.deepToString(storage.getArray()));

        } else if (storage.isFull()) {
            System.out.println("Can't add new person. The Storage is full!");
        }
    }

    public Storage findByName(String name) {
        return storage.findPerson(name);
    }
}
