package basic.Strings;

import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        System.out.println(words.length);
    }
}
