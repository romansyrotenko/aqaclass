package hw3;

import static hw3.Validator.isValid;

public class AddTenNumbersIntoMassive {

    public static void main(String args[]) {

        Container container = new Container();
        ReadInput readInput = new ReadInput();

        System.out.println("Enter 10 digits for our intStorage. The numbers have to be less 10!");

        while (!container.isFull()) {
            int value = readInput.readInt();
            if (isValid(value)) {
                container.add(value);
            }
            else {
                System.out.println("Please, enter number less 10");
            }
        }

        System.out.println("Our intStorage is full!");
        System.out.println("-----");
        System.out.println(container);
    }

}
