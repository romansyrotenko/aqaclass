package hw7.repository;

import hw7.Person;
import hw7.Storage;

public interface Dao {

    void add(Person person);

    Storage getAll();

    Storage findPersonByName(String name);

    Storage findPersonByEmail(String name);

}
