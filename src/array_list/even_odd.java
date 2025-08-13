package array_list;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        for(int i=0;i< even.size();i++){
            System.out.print(even.get(i));
            if(i<even.size()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        for(int j=0;j<odd.size();j++){
            System.out.print(odd.get(j));
            if(j< odd.size()-1){
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
