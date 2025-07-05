package recusion.array;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,66,99};
        System.out.println(ls(arr,66,0));
        System.out.println(lsindex(arr,66,0));

    }
    static boolean ls(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || ls(arr, target, index+1);
    }
    static int lsindex(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return lsindex(arr, target, index + 1);

        }
    }

}
