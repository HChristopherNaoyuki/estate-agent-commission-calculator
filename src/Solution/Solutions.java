// Package name as specified
package Solution;

import static java.lang.System.out;
import java.util.Scanner;

// Main class to run the application
public class Solutions
{
    public static void main(String[] args)
    {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for estate agent's name
        out.print("Enter the current estate agent name: ");
        String agentName = scanner.nextLine();
        
        // Prompt user for property price
        out.print("Enter the property price: ");
        double propertyPrice = scanner.nextDouble();
        
        // Create an instance of EstateAgentSales with user inputs
        EstateAgentSales agent = new EstateAgentSales(agentName, propertyPrice);
        
        // Display estate agent summary
        out.println("\nESTATE AGENT SUMMARY");
        out.println("**********************");
        agent.printPropertyReport();

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
