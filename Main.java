/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

import java.util.Scanner; // Used for user input for integer guess

public class Main { // Main Class - Used to prompt user input, call methods to compare the input with what is in store, and print those results

    public static void main(String[] args) { // Main method
        Check store = new Check(); // Create an instance of the Check subclass
        Scanner input = new Scanner(System.in); // Reference Scanner class - Used for user input
        
        System.out.println("Two dice will roll and you will guess the total:");
        System.out.println("Enter an integer (2 - 12):\n");

        int value; // Declare an integer variable to be used as a reference for the user's input
                   // The outter do/while loop will reference it as a means to continue iterating
        do { // While the user's input is not within 2 and 12 - Continue iterating through the loop
             // Non-integer inputs will be filtered out within this loop
            while (!input.hasNextInt()) { // Ensure the user's entry is an integer - if not, prompt the user to enter the data again
                                          // Used to filter out special characters, letters, and decimal numbers
                System.out.println("Invalid Input!\n\nPlease enter an integer between (2 - 12): ");
                input.next(); // Prompt the user to enter the data again
            }
            value = input.nextInt(); // Prompt the user to enter a value associated with variable "value" - Which is an integer
            if ((value < 2) || (value > 12)) { // Prompt the user to enter a value that falls between and includes 2 and 12
                System.out.println("Invalid Input!\n\nPlease enter an integer between (2 - 12): ");
            }
        } while ((value < 2) || (value > 12));

        store.setValue(value); // Take "value" as an argument for the setValue method in the Check class located in Root and match it against the sum of the rolls
        System.out.println("\nYour guess: " + store.getValue(value)); // Print the user's input to the console
        System.out.println("\nSum of the two rolls: " + store.getSum()); // Print the sum of the two rolls to the console
    }
}