package basic.arrays;
import java.util.*;
public class single {
    public static void main(String[] args) {
        /*int[] j={2,5,1,9,6};
        int sum=0;
        for(int i=0;i<j.length;i++){
            sum+=j[i];
        }
        System.out.println(sum);
        System.out.println(sum/4);*/

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        /*String[] names=new String[n];
        for(int i=0;i<n;i++){
            names[i]=input.nextLine();
        }

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }*/

        int num[]=new int[n];

        for(int i=0;i<n;i++){
            num[i]=input.nextInt();

        }
        int max=num[0];
        int min=num[0];
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}
