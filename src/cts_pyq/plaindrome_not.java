package cts_pyq;

import java.util.Scanner;

public class plaindrome_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=find_plaindrome_not(n);
        System.out.println(res);
    }
    public static  boolean find_plaindrome_not(int n){
        int orginal=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        if(orginal!=rev) return false;
        return true;
    }
    
}
