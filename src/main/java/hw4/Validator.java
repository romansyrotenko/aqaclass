package hw4;

public class Validator {

    public static boolean isValidAge(int value) {
        return (value > 0 && value < 121);
    }

    public static boolean isValidName(String name) {
       return (name.length() > 2);
    }

    public static boolean isValidPerson(Person person) {

        if (isValidName(person.getName()) & isValidAge(person.getAge())) {
            return true;
        } else {
            String errorMessage = "Something wrong... ";

            if (!isValidName(person.getName())) {
                errorMessage = errorMessage + "Name isn't valid! ";
            }
            if (!isValidAge(person.getAge())) {
                errorMessage = errorMessage + "Age isn't valid! ";
            }
            System.out.println(errorMessage + " Repeat enter again!");
            return false;
        }
    }

}
