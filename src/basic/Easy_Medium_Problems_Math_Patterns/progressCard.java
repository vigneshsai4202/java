package basic.Easy_Medium_Problems_Math_Patterns;

import java.util.Scanner;

public class progressCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90&& marks<100){
            System.out.println("S garde");
        } else if (marks>=80 && marks<90) {
            System.out.println("A grade");

        } else if (marks>=70 && marks<80) {
            System.out.println("B Grade");


        } else if (marks>=60 && marks<70) {
            System.out.println("C grade");

        } else if (marks>=50 && marks<60) {
            System.out.println("D grade");

        } else if (marks>=40 && marks<50) {
            System.out.println("E garde");

        } else {
            System.out.println("Fail");
        }


    }
}

