package hw3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddTenNumbersIntoMassive {

    public static void main(String args[]) {

        int[] intStorage = new int[10];
        int numberCount = 0;

        System.out.println("Enter 10 digits for our intStorage less 10!");
        do {
            int i = GetNumberFromConsole();
            if (i < 10) {
                intStorage[numberCount] = i;
                numberCount++;
            } else {
                System.out.println("Please, enter number less 10");
            }

        } while (numberCount < 10);
        System.out.println("Our intStorage is full!");
        System.out.println("-----");

        for (int i = 0; i < intStorage.length; i++) {
            System.out.print(intStorage[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }

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
