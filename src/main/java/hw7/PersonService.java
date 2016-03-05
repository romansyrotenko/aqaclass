package hw7;

import hw7.repository.PersonDao;

import static hw7.Storage.print;
import static hw7.Validator.isValidPerson;

public class PersonService implements Service {

    PersonDao personDao = new PersonDao();

    public void save(Person person) {

        if (isValidPerson(person)) {
                personDao.add(person);
        }
    }

    public Storage findByName(String name) {
        return personDao.findPersonByName(name);
    }

    public Storage findByEmail(String email) {
        return personDao.findPersonByEmail(email);
    }

    public void printStorage() {
        print(personDao.getAll());
    }

    public void addPerson(ReadInput readInput) {

        String name = readInput.readString("name");
        int age = readInput.readNumber("age");
        String email = readInput.readString("email");
        Person person = new Person(name, age, email);
        save(person);
    }


}
