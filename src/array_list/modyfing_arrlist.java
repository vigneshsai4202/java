package array_list;

import java.util.ArrayList;

public class modyfing_arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(8);
        arr.add(12);
        arr.add(20);
        arr.add(7);
        for(int i=0;i< arr.size();i++){
            int n=arr.get(i);
            arr.set(i,n*2);
        }
        System.out.println(arr);
    }
}
