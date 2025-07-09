package basic.arrays;

public class mergetoStringArray {
    public static void main(String[] args) {
        String[] fruit1={"apple","bannana"};
        String[] fruit2={"mango","pineapple"};
        String[] merge=new String[fruit1.length+ fruit2.length];
        for (int i=0;i<fruit1.length;i++){
            merge[i]=fruit1[i];

        }
        for(int i=0;i<fruit2.length;i++){
            merge[fruit1.length+i]=fruit2[i];
        }
        for(String s : merge){
            System.out.print(s+" ");
        }

    }




}
