package cts_pyq;

import java.util.Scanner;

public class electrcity_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        int bill=0;
        if(units<100){
            bill=units*5;
        }else if(units<200){
            bill=100*5+(units-100)*6;

        }else if(units<300){
            bill=100*5+100*6+(units-200)*7;
        }else{
            bill=units*8;
        }
        System.out.println("Bill is: " +bill);

    }

}
