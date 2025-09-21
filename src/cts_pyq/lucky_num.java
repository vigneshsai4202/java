package cts_pyq;

public class lucky_num {
    public static int lucky_num_ques(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int ch=(int)c;
            if(((ch%2)!=0) || ((i+1)%2!=0)){
                sum=sum+ch*(i+1);


            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str="JAMES";
        System.out.println(lucky_num_ques(str));
    }
}
