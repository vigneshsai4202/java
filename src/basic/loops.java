
package basic;
import java.util.*;
public class loops {
    public static int power(int x,int y){
        int r=1;
        for(int i=1;i<=y;i++){
            r=r*x;

        }
        return r;
    }
    public  static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        System.out.println(power(x,y));






    }
}
