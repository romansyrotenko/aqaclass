package hw4;

public class Validator {

    public static boolean isValidAge(int value) {
        return (value > 1 && value < 121);
    }

    public static boolean isValidName(String name) {
        return (name.length() > 2 && name.matches("^\\D*$"));
    }

}
