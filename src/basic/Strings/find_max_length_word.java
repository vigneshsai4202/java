package basic.Strings;

public class find_max_length_word {
    public static void main(String[] args) {
        String str="hello how are you reddy";
        String[] words=str.split(" ");
        String res="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>res.length()){
                res=words[i];
            }
        }
        System.out.println(res);
    }
}
