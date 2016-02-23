package hw7;

public interface Service {

    void save(Person person);

    Storage findByName(String name);

    Storage findByEmail(String email);

    void printStorage();

}
