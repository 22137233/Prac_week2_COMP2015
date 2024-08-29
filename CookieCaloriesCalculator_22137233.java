import java.util.Scanner;
// program for cookiesCalories Calculator
public class CookieCaloriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cookies eaten: ");
        int numberOfCookies = scanner.nextInt();

        double servingsConsumed = numberOfCookies / 40.0 * 10.0;
        double totalCalories = servingsConsumed * 300;

        System.out.println("You consumed " + totalCalories + " calories when you ate " + numberOfCookies + " cookies.");

        scanner.close();
    }
}