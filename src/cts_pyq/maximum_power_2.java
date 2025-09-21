package cts_pyq;

public class maximum_power_2 {
    public static int maximum_powerr(int n){
        String res="";
        while(n>0){
            int pow=1;
            while(pow*2<=n){
                pow=pow*2;
            }
            res=res+pow;
            n=n - pow;

        }
        return Integer.parseInt(res);

    }

    public static void main(String[] args) {
        int n=18;
        int reslut=maximum_powerr(n);
        System.out.println(reslut);
    }
}
