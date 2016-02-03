package hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String args[]) {

        System.out.println("Enter first number:");
        int firstNumber = GetNumberFromConsole();
        System.out.println("Enter second number:");
        int secondNumber = GetNumberFromConsole();

        System.out.println("Sum of two numbers is " + (firstNumber + secondNumber));
    }

    public static int GetNumberFromConsole() {
        int number = 0;
        boolean repeatNumberEnter;

        do {
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
                repeatNumberEnter = false;
            } catch (InputMismatchException e) {
                System.out.println("Please, enter number!");
                scanner.reset();
                repeatNumberEnter = true;
            }
        } while (repeatNumberEnter == true);

        return number;
    }
}
