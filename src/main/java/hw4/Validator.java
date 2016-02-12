package hw4;

public class Validator {

    static boolean isValidName;
    static boolean isValidAge;

    public static boolean isValidAge(int value) {
        if (value > 0 && value < 121) {
            isValidAge = true;
            return true;
        } else {
            isValidAge = false;
            return false;
        }
    }

    public static boolean isValidName(String name) {
        if (name.length() > 2) {
            isValidName = true;
            return true;
        } else {
            isValidName = false;
            return false;
        }
    }

    public static String errorMessage() {

        String errorMessage = "Something wrong... ";

        if (!isValidName) {
            errorMessage = errorMessage + "Name isn't valid! ";
        }
        if (!isValidAge) {
            errorMessage = errorMessage + "Age isn't valid! ";
        }
        errorMessage = errorMessage + " Repeat enter again!";

        return errorMessage;
    }
}
