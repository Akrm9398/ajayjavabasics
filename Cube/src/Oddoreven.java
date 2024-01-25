import java.util.Scanner; // to import scanner
public class Oddoreven // Oddoreven is class
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter a number:"); // asking to enter the number
        int k =scanner.nextInt();
        if(k % 2 == 0) // we are using percentage operator to see the reminder
        {
            System.out.println ("it is a even number");
        }
        else
            System.out.println ("it is a odd number");
    }
}
