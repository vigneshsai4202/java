package basic.Strings;

import java.util.Scanner;

public class print_lastname_firstlettr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstname= sc.nextLine();
        String lastname=sc.nextLine();
        Character ch=firstname.charAt(0);
        System.out.println(lastname+" , "+ch);

    }
}
