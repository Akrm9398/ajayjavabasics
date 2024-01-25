import java.util.Scanner; // to import scanner

public class MultiTable { // MultiTable is used as multiplication table class



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");

        if (scanner.hasNextInt()) {  // using if else condition
            int number = scanner.nextInt(); // to input

            if (number > 0) {  // if number is greater than 0
                printMultiTable(number, 1);
            } else { // if number is not greater than 0
                System.out.println("Please enter a valid positive integer.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

    }
    public static void printMultiTable(int number, int i) {
        if (i <= 10) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            printMultiTable(number, i + 1);
        }
    }
}