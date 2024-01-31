package oop.Kamau;
import java.util.Scanner;
public class Surfacecylinder {
    public static void main(String[] args) {
        double pi=3.142;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of the cylinder");
        int height=sc.nextInt();
        System.out.println("enter the radius of the cylinder");
        int radius=sc.nextInt();
        int diameter=2*radius;
        double volume=pi*radius*radius *height;
        double surfacearea=(pi*radius*radius) +(pi*diameter*height);
        System.out.println("the volume is"+volume);
        System.out.println("the surface area is"+surfacearea);
        sc.close();
    }
}
