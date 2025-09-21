package cts_pyq;

public class blanace_fruits_driver {
    public static void main(String[] args) {
        int a = 8;   // apples
        int m = 4;   // mangoes
        int rs = 6;  // rupees

        int result = BalanceFruits(a, m, rs);

        System.out.println("Apples: " + a);
        System.out.println("Mangoes: " + m);
        System.out.println("Rupees: " + rs);
        System.out.println("Rupees left after balancing: " + result);
    }

    // Function declaration only (implementation to be done)
    public static int BalanceFruits(int a, int m, int rs) {
        // Logic to be implemented
        if(a==m){
            return rs;
        }else if(a>m){
            rs=rs-(a-m)*1;
            return rs;
        }else{
            rs=rs-(m-a)*1;
            return rs;
        }

    }

}
