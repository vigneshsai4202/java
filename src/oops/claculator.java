package oops;

public class claculator {

    public int calcsum (int n, int m){
        return n+m;
    }
    public int calcdiff(int n,int m){
        return n-m;
    }

    public static void main(String[] args) {
        claculator cc=new claculator();
        int s= cc.calcsum(1,2);
        System.out.println(s);
        int d=cc.calcdiff(1,2);
        System.out.println(d);
    }
}
