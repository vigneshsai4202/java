package basic.Strings;

import java.util.Scanner;

public class compare_two_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        str2=str2.toLowerCase();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            char lowerchar=Character.toLowerCase(ch);
            if(str2.indexOf(lowerchar)!=-1){
                System.out.print(lowerchar);
            }else{
                System.out.print('+');
            }
        }
    }
}
