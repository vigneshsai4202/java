package basic.Strings;

import java.util.Scanner;

public class count_uppercase_lowercase_special {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int uppercase=0;
        int lowercase=0;
        int digit=0;
        int special=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z' ){
                uppercase++;
            }else if(ch>='a' && ch<='z'){
                lowercase++;
            }else if(ch>='0' && ch<='9'){
                digit++;
            }else{
                special++;
            }
        }
        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(digit);
        System.out.println(special);
    }
}
