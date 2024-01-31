package oop.Kamau;
import java.util.Scanner;
public class Density {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the mass");
       int mass=s.nextInt();
       System.out.println("Enter the volume");
       int volume=s.nextInt();
       int density=mass/volume;
       System.out.println("the density is"+density);
       s.close();

    }
}
