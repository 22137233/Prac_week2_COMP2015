import java.util.Scanner;

public class StockCommission {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the share price
        System.out.print("Enter the share price: ");
        double sharePrice = scanner.nextDouble();

        // Prompt the user to enter the number of shares
        System.out.print("Enter the number of shares: ");
        int numberOfShares = scanner.nextInt();

        // Validate the number of shares
        if (numberOfShares < 100 || numberOfShares > 100000) {
            System.out.println("Invalid number of shares. It must be between 100 and 100,000.");
            return;
        }

        // Validate the share price
        if (sharePrice <= 0 || sharePrice > 500) {
            System.out.println("Invalid share price. It must be greater than $0 and less than or equal to $500.");
            return;
        }

        // Calculate the stock cost
        double stockCost = sharePrice * numberOfShares;

        // Calculate the commission
        double commission = stockCost * 0.0425;

        // Calculate the total amount paid
        double total = stockCost + commission;

        // Display the results
        System.out.println("Amount paid for the stock alone: $" + stockCost);
        System.out.println("Commission paid to the stockbroker: $" + commission);
        System.out.println("Total amount paid: $" + total);

        // Close the scanner
        scanner.close();
    }
}
