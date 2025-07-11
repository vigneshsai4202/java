
package basic.Strings;

import java.util.Scanner;




public class count_occurences_of_each_letter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        char target=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target) count++;
        }
        System.out.println(count);
    }
}
