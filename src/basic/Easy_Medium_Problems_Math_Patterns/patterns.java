package basic.Easy_Medium_Problems_Math_Patterns;
import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }*/
        /*for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
    /*for (int i=1;i<=n;i++){
       for(int j=1;j<=n;j++) {
           System.out.print("*");
       }
        System.out.println();
    }*/

        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();*/

        /*for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        int m=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(m);
                m++;
            }
            System.out.println();

        }
    }
}
