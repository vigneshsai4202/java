
package basic.Easy_Medium_Problems_Math_Patterns;
import  java.util.*;

public class calclulator {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a =input.nextInt();
        int b= input.nextInt();
        char c=input.next().charAt(0);
        switch (c){
            case'+':
                System.out.println(a+b);
                break;
            case'-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case'/':
                System.out.println(a/b);
                break;
                case'%':
                    System.out.println(a%b);
                    break;
            default:
                System.out.println("exit");
                break;
        }

    }
}
