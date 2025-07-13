package basic.Strings;

import java.util.Scanner;

public class find_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String max_len=words[0];
        for(String word:words){
            if(word.length()>=max_len.length()){
                max_len=word;
            }
        }
        System.out.println(max_len);
    }
}
