package basic.Easy_Medium_Problems_Math_Patterns;
import  java.util.*;

public class lcm {
    static int lcm(int n1,int n2){
        int lcm1=(n1>n2)? n1:n2;
        while(true){
            if(lcm1%n1==0 && lcm1%n2==0){
                System.out.println(lcm1);
                break;
            }
        }
        return lcm1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();
        lcm(n1,n2);
    }

}
