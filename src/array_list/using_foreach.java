package array_list;

import java.util.ArrayList;

public class using_foreach {
    public static void main(String[] args) {

            ArrayList<String> arr=new ArrayList<>();
            arr.add("Sai");
            arr.add("Vignesh");
            arr.add("Gopisetti");
            for(String a:arr){
                System.out.println(a);
            }
    }
}
