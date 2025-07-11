
package basic.Easy_Medium_Problems_Math_Patterns;
import  java.util.*;

public class gcd {
    static int gcdof(int n1,int n2){
        int num=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                num=i;
            }

        }
        return num;


    }
    static  int gcdw(int n1,int n2){
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }
            if(n1<n2){
                n2=n2-n1;
            }
        }
        return n1;
    }

    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(gcdw(n1,n2));
    }
}

