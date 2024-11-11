// Package name as specified
package Solution;

abstract class EstateAgent implements IEstateAgent
{
    protected String agentName;
    protected double propertyPrice;

    // Constructor
    public EstateAgent(String agentName, double propertyPrice)
    {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    // Getter for agent name
    @Override
    public String getAgentName()
    {
        return agentName;
    }

    // Getter for property price
    @Override
    public double getPropertyPrice()
    {
        return propertyPrice;
    }

    // Method to calculate commission (20% of property price)
    @Override
    public double getAgentCommission()
    {
        return propertyPrice * 0.20;
    }
}
