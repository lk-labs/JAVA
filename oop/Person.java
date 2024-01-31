package oop;
public class Person {
    String name;
    int weight;
    int age;
    int height;
     void input(String name,int weight,int height,int age){
        this.name=name;
        this .age=age;
        this.weight=weight;
        this.height=height;

    }
    void display(){
        System.out.println("name is "+this.name);
        System.out.println("age is "+this.age);
        System.out.println("weight is "+this.weight);
        System.out.println("height is "+this.height);
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.input("lucy",19, 80, 21);
        p.display();
    }
}
