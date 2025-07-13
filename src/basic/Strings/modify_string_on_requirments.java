package basic.Strings;

import java.util.Scanner;

public class modify_string_on_requirments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        String res="";
        for(int i=0;i< words.length;i++){
            if((i+1)%2==1){
                res+=words[i].toUpperCase()+" ";
            }else{
                String rev="";
                for(int j= words[i].length()-1;j>=0;j--){
                    rev+=words[i].charAt(j);
                }
                res+=rev+" ";
            }
        }
        System.out.println(res);
    }
}
