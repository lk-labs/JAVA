package oop.Kamau.math;
import java.util.Scanner;
public class Stringof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=sc.nextInt();
        String grade=(marks >=50)?String.valueOf("pass") :String.valueOf("Fail");
        System.out.println("your grade is "+grade);
        sc.close();
        
    }
}
