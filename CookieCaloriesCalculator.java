import java.util.Scanner;

public class CookieCaloriesCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of cookies eaten
        System.out.print("Enter the number of cookies eaten: ");
        int numberOfCookies = scanner.nextInt();

        // Calculate the number of servings consumed
        double servingsConsumed = numberOfCookies / 40.0 * 10.0;

        // Calculate the total calories consumed
        double totalCalories = servingsConsumed * 300;

        // Display the result
        System.out.println("You consumed " + totalCalories + " calories when you ate " + numberOfCookies + " cookies.");

        // Close the scanner
        scanner.close();
    }
}
