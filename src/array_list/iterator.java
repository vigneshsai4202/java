package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {

            ArrayList<String> arr=new ArrayList<>();
            arr.add("Sai");
            arr.add("Vignesh");
            arr.add("Gopisetti");
            Iterator i=arr.iterator();
            while(i.hasNext()){
                System.out.println(i.next()+" ");
            }

    }
}
