package recusion;

public class reverseofnum {
    public static void main(String[] args) {
        revere(1234);
        System.out.println(sum);


    }
    static int sum=0;
    static void revere(int n){
        if(n==0){
            return ;
        }
        int r=n%10;
        sum=sum*10+r;
        revere(n/10);




    }
}
