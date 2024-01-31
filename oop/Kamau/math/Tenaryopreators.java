package oop.Kamau.math;
import java.util.Scanner;
public class Tenaryopreators {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=sc.nextInt();
        String grade=(marks>=70)?"pass":"Fail";
        System.out.println("your grade is"+ grade );
        sc.close();

    }
}
