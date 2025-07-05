package basic;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("What is your name ");
        String name=scanner.nextLine();
        System.out.println("What is your age");
        int age= scanner.nextInt();
    }
}
