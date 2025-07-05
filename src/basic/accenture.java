import java.util.Scanner;

public class accenture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Add it to the sum
            sum += digit;

            // Remove the last digit
            number /= 10;
        }

        // Print the sum of digits
        System.out.println("Sum of digits: " + sum);
    }
}
