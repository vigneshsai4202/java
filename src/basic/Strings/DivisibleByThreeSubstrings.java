package basic.Strings;

public class DivisibleByThreeSubstrings {
    // Function to count substrings of length 3 divisible by 3
    public static int countDivisibleBy3(String s) {
        int count = 0;
        // Iterate over every substring of length 3
        for (int i = 0; i <= s.length() - 3; i++) {
            // Take substring of 3 consecutive digits
            String substr = s.substring(i, i + 3);
            // Calculate sum of the digits
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += substr.charAt(j) - '0';
            }
            // Check if sum is divisible by 3
            if (sum % 3 == 0) {
                count++;
            }
        }
        return count;
    }

    // Example usage
    // Example usage
    public static void main(String[] args) {
        String s = "123456";
        System.out.println(countDivisibleBy3(s)); // Output: 2

    }
}
