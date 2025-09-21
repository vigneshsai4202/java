package cts_pyq;

public class prime_not{
    public static void main(String[] args) {
        //int n=9;



        //boolean res=prime(n);
        //System.out.println(res);

        prime_1_100();

    }
    public static boolean prime(int n){
        boolean prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime =false;
                break;
            }
        }
        return true;
    }
    // Method to print prime numbers from 1 to 100
    public static void prime_1_100() {
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;

            // Check divisibility
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }





    }
}
