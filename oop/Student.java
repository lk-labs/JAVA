
package oop;
import java.util.Scanner;
public class Student {
    String name;
    int age;
    String department;
    String faculty;

    void capturestudent(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name ");
        name=s.nextLine();

        System.out.println("enter your age");
        age=s.nextInt();

        s.nextLine();

        System.out.println("enter the name of department");
        department=s.nextLine();

        System.out.println("enter the name of faculty");
        faculty=s.nextLine();

    }
    void display(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
        System.out.println(" department "+department);
        System.out.println("faculty is "+faculty);
    }
    public static void main(String[] args) {
        Student s=new Student();
        s.capturestudent();
        s.display();
    }

}
