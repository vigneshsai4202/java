package cts_pyq;

import java.util.Arrays;

public class sum_of_fhalf_shalf_reverearray {
    public static  int[] rev_arr(int[] arr){
        int s_fhalf=0;
        int s_shalf=0;
        int length=arr.length/2;
        for(int i=0;i<length;i++){
            s_fhalf+=arr[i];
        }
        for(int i=length;i<arr.length;i++){
            s_shalf+=arr[i];
        }
        int[] newarr=new int[arr.length];
        if(s_fhalf<s_shalf){
            for( int i=0;i<arr.length;i++){
                newarr[i]=arr[arr.length-1-i];
            }
        }
        else{
            return arr;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] arr={1,4,6,5,6,7};

        System.out.println(Arrays.toString(rev_arr(arr)));
    }
}
