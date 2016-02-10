package hw3;

import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readInt() {

        int number = 0;
        boolean repeatNumberEnter;

        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                repeatNumberEnter = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter number!");
                scanner.reset();
                repeatNumberEnter = true;
            }
        } while (repeatNumberEnter == true);

        return number;
    }
}
