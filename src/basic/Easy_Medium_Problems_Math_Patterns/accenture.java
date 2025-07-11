package basic.Easy_Medium_Problems_Math_Patterns;

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

    public static class month {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            switch(n){
                case(1):
                    System.out.println("Janurary");
                    break;
                case(2):
                    System.out.println("Febraury");
                    break;
                case(3):
                    System.out.println("March");
                    break;
                case(12 ):
                    System.out.println("Decemeber");
                    break;

            }

        }
    }

    public static class loops {
        public static int power(int x,int y){
            int r=1;
            for(int i=1;i<=y;i++){
                r=r*x;

            }
            return r;
        }
        public  static  void main(String[] args){
            Scanner input=new Scanner(System.in);
            int x=input.nextInt();
            int y=input.nextInt();
            System.out.println(power(x,y));






        }
    }

    public static class fibonacci {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int firstnum=0;
            int seconum=1;
            for(int i=1;i<=n;i++){
                System.out.println(firstnum+" ");
                int nextnum=firstnum+seconum;
                firstnum=seconum;
                seconum=nextnum;
            }

        }
    }
}
