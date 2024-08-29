import java.util.Scanner;

public class StockCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the share price: $");
        double sharePrice = scanner.nextDouble();

        System.out.print("Enter the number of shares: ");
        int numberOfShares = scanner.nextInt();

        if (numberOfShares < 100 || numberOfShares > 100000) {
            System.out.println("Invalid number of shares. Valid range: 100-100,000.");
            return;
        }

        if (sharePrice <= 0 || sharePrice > 500) {
            System.out.println("Invalid share price. Valid range: >$0 and <=$500.");
            return;
        }

        double stockCost = sharePrice * numberOfShares;
        double commission = stockCost * 0.0425;
        double total = stockCost + commission;

        System.out.println("Stock price: $" + stockCost);
        System.out.println("Commission: $" + commission);
        System.out.println("Total amount paid: $" + total);

        scanner.close();
    }
}