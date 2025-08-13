package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class removing_elem_using_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(8);
        arr.add(12);
        arr.add(20);
        arr.add(7);
        Iterator it= arr.iterator();
        while(it.hasNext()){
            int i=(Integer)it.next();
            if(i<10){
                it.remove();
            }else{
                System.out.println(i);
            }

        }

    }
}
