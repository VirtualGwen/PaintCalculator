import java.util.Scanner;
import java.io.IOException;

public class Paint1 {

    public static void main(String[] args) throws Throwable{
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
            //Exception handling to check for wayward strings.
            try {
                wallHeight = scnr.nextDouble();
                //User feedback to prevent divide by zero errors.
                if (wallHeight <= 0) {
                    System.out.println("A number greater than 0 please.");
                }
            } catch (Exception e) {
                //handle exception and scan for next input
                System.out.println("Numerals only please.");
                scnr.next();
            }
                      
            
        } while (wallHeight <= 0);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            System.out.println("Enter wall width (feet): ");
            //Ensure no strings make it through
            try {
                wallWidth = scnr.nextDouble();
            } catch (Exception e) {
                //handle exception
                System.out.println("Numerals only please.");
                scnr.next();
            }
            
            //Gently remind user to not divide by zero.
            if (wallWidth <= 0) {
                System.out.println("A number greater than 0 please.");
            }
        } while (wallWidth <= 0); //Loop around if the number is zero or less to ensure accurate measurements.

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
