package test;

import hw5.Person;
import hw5.Storage;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPersonsStorage {

   @Test
    public void testSavePersonIntoStorage()  {

       Storage storage = new Storage();
       Person person = new Person("roman", 32);

        storage.add(person);
        assertEquals(storage.getArray()[0].getName(), "roman");
        assertEquals(storage.getArray()[0].getAge(),32);

    }

    @Test
    public void testStorageIsFull()  {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);

        storage.add(person);
        storage.add(person);
        storage.add(person);
        storage.add(person);
        storage.add(person);

        assertEquals(storage.isFull(), true);
    }

    @Test
    public void testStorageIsNotFull()  {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);

        storage.add(person);
        assertEquals(storage.isFull(), false);
    }
}
