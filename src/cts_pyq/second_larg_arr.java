package cts_pyq;

public class second_larg_arr {
    public static void main(String[] args) {
        int[] a = new int[] { 20, 30, 50, 4, 71, 100};
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max1=a[i];
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max2 && a[i]<max1  ){
                max2=a[i];
            }
        }
        System.out.println(max2);
    }
}
