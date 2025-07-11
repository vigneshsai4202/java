package oops;

public class person {
    String name;
    int age;

    public person(String name, int i) {
        this.name = name;
    }
    public person(int age){
        this.age=age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        person s1=new person("Sai",22);
        person s2=new person("vignesh",23);
        System.out.println(s1.getName()+s1.getAge());
        System.out.println(s2.getName()+s2.getAge());



    }
}
