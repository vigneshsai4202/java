package cts_pyq;

public class find_largest_arr {
    public static void main(String[] args) {
        int[] a = new int[] { 20, 30, 50, 4, 71, 100};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max element is: "+max);


    }

    public static int max_elem(int a[],int max){
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
}
