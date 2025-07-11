package basic.Stringys;

import java.util.Scanner;

public class reverse_each_word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String reslut="";
        for( String word:words){
            String reversed="";
            for(int i= word.length()-1;i>=0;i--){
                reversed+=word.charAt(i);
            }
            reslut+=reversed+" ";
        }
        System.out.println(reslut.trim());

    }
}
