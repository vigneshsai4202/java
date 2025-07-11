package oops;

public class printmsg {
    public  void printMsg(String name){
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        printmsg msg=new printmsg();
        msg.printMsg("sai");

    }
}
