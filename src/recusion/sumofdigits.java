package recusion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sum(1234));

    }
    static int sum(int n){
        if(n==0){
            return 1;
        }
        return (n%10)+sum(n/10);
    }
}
