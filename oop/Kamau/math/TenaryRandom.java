package oop.Kamau.math;

public class TenaryRandom {
    public static void main(String[] args) {
        int marks=(int)(20+Math.ceil(Math.random()*80));
        String grade=(marks>=100)?"pass":"fail";

        System.out.println("your marks is "+  marks + "your grade is"+grade);
    }
}
