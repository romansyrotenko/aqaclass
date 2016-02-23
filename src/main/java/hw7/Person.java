package hw7;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.email = "";
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        String emailField= "";

        if (!email.isEmpty()) {
            emailField = ", email='" + email + "'";
        }

        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                emailField +
                '}';
    }
}
