import java.util.Scanner;

class PrimeNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number (n) to find all prime numbers between 1 and n: ");
        int n = input.nextInt();

        System.out.println("Prime numbers between 1 and " + n + ":");

        int num = 2; // Start checking from 2
        while (num <= n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }

        input.close(); // Close the scanner
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        int i = 2; // Start checking from 2
        while (i <= num / 2) { // Check divisors up to num / 2
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
            i++;
        }

        return true; // If no factors found, it's prime
    }
}
