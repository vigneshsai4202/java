package oops;

public class Apseries {
    public int calcluatesum(int n){
        int a=1;
        int b=2;

        return (n*(2*a+(n-1)*b)/2);

    }

    public static void main(String[] args) {
        Apseries ap=new Apseries();
        int n=ap.calcluatesum(5);
        System.out.println(n);
    }
}
