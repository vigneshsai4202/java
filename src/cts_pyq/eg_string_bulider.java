package cts_pyq;

public class eg_string_bulider {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");

        System.out.println(sb);
        sb.append("world");
        System.out.println(sb);
        sb.insert(1,"H");
        System.out.println(sb);
        sb.delete(1,2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }

}
