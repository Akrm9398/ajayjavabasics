import java.util.Scanner; // to import sanner
public class Largenumber // largenumber is a class
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any three numbers: ");
        int x = scanner.nextInt(); // first input
        int y = scanner.nextInt(); //second input
        int z = scanner.nextInt(); // third input

        if(x>y && x>z) // using if else and "and" operator, && operators checks if both the conditions are true or it will go to next statement
        {
            System.out.println("the largest of three numbers is:" + x);
        }
        else if (y>x && y>z)
        {
            System.out.println("the largest of three numbers is:" + y);
        }
        else
        {
            System.out.println("the largest of three numbers is:" + z);
        }
    }
}