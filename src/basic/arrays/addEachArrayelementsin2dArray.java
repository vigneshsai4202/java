package basic.arrays;

public class addEachArrayelementsin2dArray {
    public static void main(String[] args) {
        int[][] arr1={{1,2,4},{9,7,2},{7,6,4}};
        int[][] arr2={{2,6,8},{0,1,3},{1,2,4}};
        int[][] arr3=new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];




            }
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[0].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
