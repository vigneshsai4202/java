package basic;
import java.util.*;

public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n%4==0 && n%100!=0)|| (n%400==0)){
            System.out.println("Its a leap year");

        }else{
            System.out.println("Its not a leap year");
        }


    }
}
