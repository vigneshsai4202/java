package array_list;

import java.util.ArrayList;

public class sample_prob {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Sai");
        arr.add("Vignesh");
        arr.add("Gopisetti");
        for(int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
