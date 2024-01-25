import java.util.Scanner; // to import scanner

public class Cube  { // cube is the class
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a positive number: ");


        if (scanner.hasNextDouble()) { // using if else condition
            double userInput = scanner.nextDouble(); // to give input


            if (userInput > 0) { //using if else condtion to see if the entered number is a positive integer or not
                double cube = userInput * userInput * userInput; // formulae for cube
                System.out.println("The cube of " + userInput + " is: " + cube);
            } else {
                System.out.println("Please enter a valid positive number."); // if user didn't a positive integer it will ask to enter again
            }
        } else {
            System.out.println("Please enter a valid number.");
        }

    }
}
