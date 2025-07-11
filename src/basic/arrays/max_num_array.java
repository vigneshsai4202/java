package basic.arrays;

public class max_num_array {
    public static void main(String[] args) {
        int[] arr={2,5,1,9,6};
        int max=arr[0];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}
