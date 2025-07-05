package oops;

public class employee_details {
    String name;
    int id;
    int mob;

    public employee_details(String name) {
        this.name = name;
    }
    public employee_details(String name,int id,int mob){
        this.name=name;
        this.id=id;
        this.mob=mob;
    }
    public  void display_details(){
        System.out.println("name is"+name);
        if(id!=0){
            System.out.println("Id is"+id);
        }
        if(mob!=0){
            System.out.println("Mobile number is"+mob);}
    }

    public static void main(String[] args) {
        employee_details emp=new employee_details("sai");
        emp.display_details();
        employee_details emp1=new employee_details("sai",123,76050);
        emp1.display_details();
    }
}
