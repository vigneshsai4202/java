package basic.arrays;
import java.util.Scanner;
public class mutli_arr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*sum of elements in array
        int m=input.nextInt();
        int n=input.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=input.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
        */

        // sum of two of elemnts in array of each element





         //square of each element in array
       /* int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int[][] c_arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                c_arr[i][j]=arr[i][j]*arr[i][j];
            }
        }
        for(int i=0;i<m;i++){

            for (int j = 0; j < n; j++) {
                System.out.println(c_arr[i][j]);
            }
        }
        System.out.println();
*/





        //
        /* if the element of two arrays print 1 otherwise 0

        int m1 = input.nextInt();
        int n1 = input.nextInt();
        int[][] arr = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // Read second array dimensions and elements
        int m2 = input.nextInt();
        int n2 = input.nextInt();
        int[][] arr1 = new int[m2][n2];
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < n2; j++) {
                arr1[i][j] = input.nextInt();
            }
        }

        // ✅ Check if dimensions match before proceeding
        if (m1 != m2 || n1 != n2) {
            System.out.println("Arrays have different dimensions, comparison not possible.");
            return;
        }

        // Initialize comparison array
        int[][] c_arr = new int[m1][n1];

        // Compare elements
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                c_arr[i][j] = (arr[i][j] == arr1[i][j]) ? 1 : 0;
                System.out.print(c_arr[i][j] + " "); // ✅ Properly formatted output
            }
            System.out.println(); // ✅ Move to next row
        }

        */




        // TRANSPOSE OF A MATRIX

       /* int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int[][] c_arr= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c_arr[i][j] =arr[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(c_arr[i][j]) ;
            }
        }





*/




    }
}
