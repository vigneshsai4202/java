package cts_pyq;
import  java.util.*;

public class diff_btw_ele_at_odd_even_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even+=arr[i];
            }else{
                odd+=arr[i];
            }
        }
        System.out.println(even-odd);
    }
}
