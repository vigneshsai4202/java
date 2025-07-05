package basic.strings;
import java.util.Scanner;

public class basicques {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //  length of the string
        /*String str=input.nextLine();
        System.out.println(str.length());*/


        //count no of words

        /*String str=input.nextLine();
        String[] str2=str.split("\\s+");
        System.out.println(str2.length);
        */


        /*count the no of target cahracter int  he given string


        String str=input.nextLine();
        char chr=input.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==chr){
                count++;
            }
        }
        System.out.println(count);

         */


        /*Revresing an String

        String str=input.nextLine();
        String r_str="";
        for(int i=str.length()-1;i>=0;i--)
        {
            r_str+=str.charAt(i);
        }
        System.out.println(r_str);

         */


        // Removing srating and ending spaces

        String str=input.nextLine();
        String str1=str.trim();
        System.out.println(str1);


    }

}
