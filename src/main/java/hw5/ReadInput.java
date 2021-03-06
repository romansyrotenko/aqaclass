package hw5;

import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readNumber(String item) {

        int number = 0;
        boolean repeat;

        System.out.println("Enter " + item);

        do {
            try {
                number = Integer.parseInt(scanner.nextLine());
                repeat = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter valid " + item);
                scanner.reset();
                repeat = true;
            }
        } while (repeat == true);

        return number;
    }

    public String readName() {

        String name = "";
        boolean repeat;

        System.out.println("Enter name:");

        do {
            try {
                name = scanner.nextLine();
                repeat = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter valid name!");
                scanner.reset();
                repeat = true;
            }
        } while (repeat == true);

        return name;
    }

}
