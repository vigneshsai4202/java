package basic.arrays;

public class spiral_matrix {
    public  static void printmatrix(int[][] mat,int n){
        for (int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.println(mat[i][j]);
                }
            }else{
                for(int j=n-1;j>=0;j--){
                    System.out.println(mat[i][j]);
                }
            }

        }
    }

    public static void main(String[] args) {
        int mat[][]={
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120},
                {130,140,150,160}
        };
        int n;
        printmatrix(mat,n=4 );

    }
}

