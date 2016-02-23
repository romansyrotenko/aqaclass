package hw7;

import java.util.Scanner;

public class ReadInput {

    private Scanner scanner;

    public ReadInput() {
        this.scanner = new Scanner(System.in);
    }

    public int readNumber(String item) {

        int number = 0;
        boolean repeat = true;

        System.out.println("Enter " + item + ":");

        while(repeat) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                repeat = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter valid " + item);
                scanner.reset();
                repeat = true;
            }
        }
        return number;
    }

    public String readString(String item) {

        String name = "";
        boolean repeat = true;

        System.out.println("Enter " + item + ":");

        while(repeat) {
            try {
                name = scanner.nextLine();
                repeat = false;
            } catch (NumberFormatException e) {
                System.out.println("Please, enter valid " + item + "!");
                scanner.reset();
                repeat = true;
            }
        }
        return name;
    }

}
