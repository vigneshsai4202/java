package basic.arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] arr1={{1,2,1},{9,7,2},{7,6,4}};

        int[][] reslut=new int[3][3];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                reslut[i][j]=arr1[j][i];

            }

        }
        for(int i=0;i<reslut.length;i++){
            for(int j=0;j<reslut[0].length;j++){
                System.out.print(reslut[i][j]+" ");
            }
            System.out.println();

        }

    }

}
