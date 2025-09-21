package cts_pyq;

public class count_k_iteratations {
    public static void main(String[] args) {
        int[] arr={1,4,6,1,4,6};
        int k=3;

        System.out.println(max_iterantions(arr,k));

    }
    public static int max_iterantions(int arr[],int k){
        int count=0;

        for(int i=0;i<arr.length;i++){
            int j=(i+k)%arr.length;
            if(arr[i]==arr[j]){
                count++;
            }
        }
        return count;
    }
}
