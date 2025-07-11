package basic.arrays;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        System.out.println("Hello vignesh!");
        int a=90;
        int b=100;
        int x=a+b;
        System.out.println(x);

    }

    public static class prime {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int flag=0;
            if(n<=1){
                System.out.println(n+"is not a neither prime nor not prime");
            }else{
                int midlle=n/2;
                for(int i=2;i<=midlle;i++){
                    if(n%i==0){
                        System.out.println(n+"is not a prime number");
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println(n+"is a prime number");
                }

            }
        }
    }
}
