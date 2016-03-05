package hw10.repository;

import hw10.Person;
import hw10.Storage;

public interface Dao {

    void add(Person person);

    Storage getAll();

    Storage findPersonByName(String name);

    Storage findPersonByEmail(String name);

}
