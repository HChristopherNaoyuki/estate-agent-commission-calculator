// Package name as specified
package Solution;

import static java.lang.System.out;
import java.text.DecimalFormat;

// Subclass for specific Estate Agent Sales
class EstateAgentSales extends EstateAgent
{
    // Constructor passing values to superclass
    public EstateAgentSales(String agentName, double propertyPrice)
    {
        super(agentName, propertyPrice);
    }

    // Method to print property report
    public void printPropertyReport()
    {
        // DecimalFormat for formatting numbers with #,###.00 pattern
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");

        out.println("ESTATE AGENT NAME: " + getAgentName());
        out.println("PROPERTY PRICE: R " + decimalFormat.format(getPropertyPrice()));
        out.println("AGENT COMMISSION: R " + decimalFormat.format(getAgentCommission()));
    }
}
