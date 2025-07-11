package recusion;

public class nto1 {
    public static void main(String[] args) {
        System.out.println(nto1(5));
    }
    static  int nto1(int n){
        if(n==1){
            return 1 ;
        }
        System.out.println(n);
        return nto1(n-1);
    }
}
