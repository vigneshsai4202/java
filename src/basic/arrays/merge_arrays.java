package basic.arrays;

public class merge_arrays {
    public static void main(String[] args) {
        String[] str1={"chai","coffee"};
        String[] str2={"milk","water","coke"};
        int len1= str1.length;
        int len2=str2.length;
        String[] marr=new String[len1+len2];
        for(int i=0;i<len1;i++){
            marr[i]=str1[i];
        }
        for(int j=0;j<len2;j++){
            marr[len1+j]=str2[j];
        }
        for(int i=0;i<marr.length;i++){
            System.out.print(marr[i]+" ");
        }
    }
}
