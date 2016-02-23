package test;

import hw5.Person;
import hw5.Storage;
import org.junit.Test;

import static hw5.Validator.*;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class TestPersonsStorageHW5 {

    @Test
    public void testSavePersonIntoStorage()  {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);

        storage.setAddCounter(0);
        storage.add(person);
        assertEquals(storage.getArray()[0].getName(), "roman");
        assertEquals(storage.getArray()[0].getAge(),32);

    }

    @Test
    public void testStorageIsFull()  {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        storage.setAddCounter(0);

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
        storage.setAddCounter(0);

        storage.add(person);
        assertEquals(storage.isFull(), false);
    }

    @Test
    public void testIsValidName() {

        assertTrue(isValidName("roma"));
    }

    @Test
    public void testIsNotValidNameLess4Chars() {

        assertFalse(isValidName("joe"));
    }

    @Test
    public void testIsValidNameWithOthersChars() {

        assertTrue(isValidName("roma34!!dfdf.,"));
    }

    @Test
    public void testIsValidNameWithTwoWords() {

        assertTrue(isValidName("roma roma"));
    }

    @Test
    public void testIsValidNameWithAnotherKeyboardLayout() {

        assertTrue(isValidName("рома"));
    }

    @Test
    public void testIsValidAge() {

        assertTrue(isValidAge(34));
    }

    @Test
    public void testIsMinValidAge() {

        assertTrue(isValidAge(1));
    }

    @Test
    public void testIsMaxValidAge() {

        assertTrue(isValidAge(100));
    }

    @Test
    public void testIsNotValidAgeLessMin() {

        assertFalse(isValidAge(0));
    }

    @Test
    public void testIsNotValidAgeMoreMax() {

        assertFalse(isValidAge(101));
    }

    @Test
    public void testIsValidPerson() {

        Person person = new Person("roman", 32);

        assertTrue(isValidPerson(person));
    }

    @Test
    public void testIsNotValidPersonWithValidAgeNotValidName() {

        Person person = new Person("rob", 32);

        assertFalse(isValidPerson(person));
    }

    @Test
    public void testIsNotValidPersonWithNotValidAgeValidName() {

        Person person = new Person("roman", -4);

        assertFalse(isValidPerson(person));
    }

    @Test
    public void testIsNotValidPersonWithNotValidAgeNotValidName() {

        Person person = new Person("S", 112);

        assertFalse(isValidPerson(person));
    }

    @Test
    public void testIsValidMenuItem() {

        assertTrue(isValidMenuItem(3));
    }

    @Test
    public void testIsNotValidMenuItemLessOne() {

        assertFalse(isValidMenuItem(0));
    }

    @Test
    public void testIsNotValidMenuItemMoreThanThree() {

        assertFalse(isValidMenuItem(4));
    }

    @Test
    public void testIsPersonFound() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        storage.setAddCounter(0);
        storage.add(person);
        Storage results;
        storage.setAddCounter(0);
        results = storage.findPerson("roman");

        assertEquals(results.getArray()[0].getName(), "roman");
    }

    @Test
    public void testIsTwoPersonsFound() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        Person personTwo = new Person("roman", 48);
        storage.setAddCounter(0);
        storage.add(person);
        storage.add(personTwo);
        storage.setAddCounter(0);
        Storage results = storage.findPerson("roman");

        assertEquals(results.getArray()[0].getName(),"roman");
        assertEquals(results.getArray()[1].getName(),"roman");
    }

    @Test
    public void testIsNotPersonFound() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        storage.setAddCounter(0);
        storage.add(person);
        storage.setAddCounter(0);
        Storage results = storage.findPerson("dima");

        assertEquals(results.getArray()[0], null);
    }

}
