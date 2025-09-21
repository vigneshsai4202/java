package cts_pyq;

import java.util.Scanner;

public class folyds_trainagle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
