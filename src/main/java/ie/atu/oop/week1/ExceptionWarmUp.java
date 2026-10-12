package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // read information from keyboard
        boolean valid = false;

        while(!valid) // dodis
        {
            System.out.println("Enter a pagecount: ");
            String text = scan.nextLine(); // nextline scans string but other methods can read bool, int etc
            try
            {
                int pagecount = Integer.parseInt(text); // its gonna convert the thing into a number
                System.out.println("You entered: "+ pagecount);
                valid = true; // successful input leaves the loop
            }
            catch (NumberFormatException Error)
            {
                System.out.println("Invalid input " + Error.getMessage());
            }
        }

    }
}
