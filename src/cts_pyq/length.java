package cts_pyq;
import java.util.*;

public class length {
    public static void main(String[] args) {
        int n = 12;
        int[] arr = {3,42,60,14,12};

        int result = findDifference(n, arr);
        System.out.println(result);
    }
    public  static int findDifference(int n,int arr[]){
        int sum=0;
        int nsum=0;
        int rem=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>n){
                rem=arr[i]/n;
                sum+=rem;

            }else{
                nsum+=0;
            }


        }
        return sum;




    }

}
