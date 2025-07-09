package basic.arrays;
import java.util.*;
public class snakePattern {
    public static  void printSnakePattern(int[][] mat,int N){
        for (int i=0;i<N;i++){
            if(i%2==0){
                for(int j=0;j<N;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }else{
                for(int j=N-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat={
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160}
        };
        printSnakePattern(mat,4);

    }
}
