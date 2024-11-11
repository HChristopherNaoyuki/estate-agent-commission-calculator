# Estate Agent Commission Calculator

A Java console application that calculates and displays an estate agent's commission based on property sales. The commission is set at 20% of the property's sale price. Users can input the agent's name and the property price, and the application will display the formatted output showing the agent's name, property price, and calculated commission.

## Table of Contents
- [Project Structure](#project-structure)
- [Installation](#installation)
- [Usage](#usage)
- [Example Output](#example-output)

---

## Project Structure

The application consists of the following classes:

1. **IEstateAgent** - An interface that defines methods for retrieving the agent's name, property price, and commission amount.
2. **EstateAgent** - An abstract class that implements `IEstateAgent` and provides the base functionality for storing agent name and property price, and calculating the commission.
3. **EstateAgentSales** - A subclass of `EstateAgent` that contains a `printPropertyReport` method to display the formatted report with the agent's name, property price, and commission.
4. **Solutions** - The main class that initializes the application, collects user input, and outputs the formatted report.

---

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/HChristopherNaoyuki/estate-agent-commission-calculator.git
    cd estate-agent-commission-calculator
    ```

2. **Compile the classes**:
    ```bash
    javac Solution/*.java
    ```

3. **Run the application**:
    ```bash
    java Solution.Solutions
    ```

---

## Usage

1. Run the application. You will be prompted to enter the estate agent's name and the property price.

2. Once you provide the required inputs, the application will calculate a 20% commission on the property price and display a formatted summary with the following information:
    - **Estate Agent Name**
    - **Property Price** (formatted with currency symbol and thousands separator)
    - **Agent Commission** (formatted similarly)

---

## Example Output

When you run the application, you should see output similar to this:

```plaintext
Enter the current estate agent name: Joe Bloggs
Enter the property price: 120000

ESTATE AGENT SUMMARY
***********************
ESTATE AGENT NAME: Joe Bloggs
PROPERTY PRICE: R 120,000.00
AGENT COMMISSION: R 24,000.00
