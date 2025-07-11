package basic.arrays;

public class max_len_arr {
    public static void main(String[] args) {
        String[] str={"chai", "coffee", "milk water", "coke"};
        String min=str[0];
        int index=0;
        for(int i=0;i< str.length;i++){
            if(str[i].length()<min.length()){
                min=str[i];
                index=i;
            }
        }
        System.out.println(min);
        System.out.println(index);
    }
}
