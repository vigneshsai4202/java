package basic.arrays;

public class flipping_array {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);


    }
}
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr1[][]=new int[][]
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length;j>=0;j--){
                arr1[i][j]=image[i][j];


            }
        }
        return arr1;

    }

}
