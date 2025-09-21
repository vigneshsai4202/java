package cts_pyq;

public class pattern_using_stars {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
