package hw4;

import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readAge() {

        int number = 0;
        boolean repeatNumberEnter;

        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                repeatNumberEnter = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter age!");
                scanner.reset();
                repeatNumberEnter = true;
            }
        } while (repeatNumberEnter == true);

        return number;
    }

    public String readName() {

        String name = "";
        boolean repeatNumberEnter;

        do {
            try {
                name = scanner.nextLine();
                repeatNumberEnter = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter valid name!");
                scanner.reset();
                repeatNumberEnter = true;
            }
        } while (repeatNumberEnter == true);

        return name;
    }


}
