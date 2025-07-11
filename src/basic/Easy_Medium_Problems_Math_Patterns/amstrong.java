package basic.Easy_Medium_Problems_Math_Patterns;
import java.util.*;

public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(amstrong(n));


    }
    static boolean amstrong(int n){
        int digit=0;
        while(n!=0){
            n=n/10;
            digit++;
        }
        int sum=0;
        int temp=n;
        while(n!=0){
            int m=n%10;
            sum= (int) (sum+Math.pow(m,digit));
            n=n/10;
        }
        if( sum==n){
            return  true;
        }
        return false;
    }

}
