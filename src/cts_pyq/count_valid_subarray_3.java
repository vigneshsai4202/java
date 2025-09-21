package cts_pyq;

public class count_valid_subarray_3 {
    public static  int  subarry(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-3;i++){

                if(arr[i+1]==arr[i]+arr[i+2]){
                   sum++;
                }


        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,2,4,2};
        System.out.println(subarry(arr));
    }
}
