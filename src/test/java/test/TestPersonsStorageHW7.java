package test;

import hw7.Person;
import hw7.Storage;
import org.junit.Test;

import static hw7.Validator.*;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class TestPersonsStorageHW7 {

   @Test
    public void testSavePersonIntoStorage()  {

       Storage storage = new Storage();
       Person person = new Person("roman", 32, "roman.syrotenko@gmail.com");

       storage.setAddCounter(0);
       storage.add(person);
       assertEquals(storage.getArray()[0].getName(), "roman");
       assertEquals(storage.getArray()[0].getAge(),32);
       assertEquals(storage.getArray()[0].getEmail(),"roman.syrotenko@gmail.com");

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
    public void testIsValidEmail() {

        assertTrue(isValidEmail("roman.sirotenko@gmail.com"));
    }

    @Test
    public void testIsNotValidEmail() {

        assertFalse(isValidEmail("roman.s gmail.com"));
    }

    @Test
    public void testIsNotValidFirstPartOfEmail() {

        assertFalse(isValidEmail("!!!roman.sirotenko@gmail.com"));
    }

    @Test
    public void testIsNotValidSecondPartOfEmail() {

        assertFalse(isValidEmail("roman.sirotenko@gmco.m"));
    }

    @Test
    public void testIsNotValidEmailWithoutAt() {

        assertFalse(isValidEmail("roman.sirotenkogmail.com"));
    }

    @Test
    public void testIsValidPerson() {

        Person person = new Person("roman", 32, "roman.sirotenko@gmail.com");

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
    public void testIsNotValidPersonWithNotValidAgeNotValidNameNotValidEmail() {

        Person person = new Person("S", 112, "ro@@gmail.com");

        assertFalse(isValidPerson(person));
    }

    @Test
    public void testIsValidMenuItem() {

        assertTrue(isValidMenuItem(3));
    }

    @Test
    public void testIsNotValidMenuItemLessMin() {

        assertFalse(isValidMenuItem(-1));
    }

    @Test
    public void testIsNotValidMenuItemMoreThanMax() {

        assertFalse(isValidMenuItem(5));
    }

    @Test
    public void testIsPersonFound() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        storage.setAddCounter(0);
        storage.add(person);
        Storage results;
        storage.setAddCounter(0);
        results = storage.findPersonByName("roman");

        assertEquals(results.getArray()[0].getName(), "roman");
    }

    @Test
    public void testIsTwoPersonsFoundByName() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        Person personTwo = new Person("roman", 48);
        storage.setAddCounter(0);
        storage.add(person);
        storage.add(personTwo);
        storage.setAddCounter(0);
        Storage results = storage.findPersonByName("roman");

        assertEquals(results.getArray()[0].getName(),"roman");
        assertEquals(results.getArray()[1].getName(),"roman");
    }

    @Test
    public void testIsTwoPersonsFoundByEmail() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32, "roman.syrotenko@gmail.com");
        Person personTwo = new Person("roman", 48, "roman.syrotenko@gmail.com");
        storage.setAddCounter(0);
        storage.add(person);
        storage.add(personTwo);
        storage.setAddCounter(0);
        Storage results = storage.findPersonByEmail("roman.syrotenko@gmail.com");

        assertEquals(results.getArray()[0].getEmail(),"roman.syrotenko@gmail.com");
        assertEquals(results.getArray()[1].getEmail(),"roman.syrotenko@gmail.com");
    }

    @Test
    public void testIsNotPersonFound() {

        Storage storage = new Storage();
        Person person = new Person("roman", 32);
        storage.setAddCounter(0);
        storage.add(person);
        storage.setAddCounter(0);
        Storage results = storage.findPersonByName("dima");

        assertEquals(results.getArray()[0], null);
    }

}