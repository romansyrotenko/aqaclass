package hw5;

public interface Service {

    void save(Person person);

    Storage findByName(String name);

}
