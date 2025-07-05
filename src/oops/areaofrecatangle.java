package oops;

public class areaofrecatangle {
    int l;
    int b;
    public int area(int l,int b){
        this.l=l;
        this.b=b;

        return l*b;
    }

    public int getL(){
        return l;
    }
    public int getB(){
        return b;
    }
    public void setL(int l){
        this.l=l;
    }
    public void setB(int b){
        this.b=b;
    }
    public int area(){
        return l*b;
    }

    public static void main(String[] args) {
        areaofrecatangle a=new areaofrecatangle();
        a.setL(5);
        a.setB(5);
        int cal=a.area();
        System.out.println(cal);
    }

}
