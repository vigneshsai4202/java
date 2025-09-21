package cts_pyq;

public class numbers_in_sequence_way {

    public static void main(String[] args) {
        int a=3;
        int b=4;
        int n=8;
        for(int i=0;i<n;i++){
            int c=a+b;
            System.out.println( a+" "+b+" "+c);

            System.out.println();
            a=c;
            b=b+1;
        }

    }
}

