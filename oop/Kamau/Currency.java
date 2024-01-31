package oop.Kamau;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        //1 ksh=24 ugandan shillings
        //1 dollar =1950 
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount of money in kenyan shillings");
        int shillings=s.nextInt();
        System.out.println("enter the amount of money in ugandan shillings");
        int ushillings=s.nextInt();
        int Ksh=24 ;//1 ksh=24 ugandan shillings
        int Dollar=1950;
        int uG=shillings*Ksh;
        int dollarshillings=ushillings/Dollar;; 
        System.out.println("shillings converted to ugandan shillings is"+uG);
        System.out.println("ugandan shillings converted to dollar is"+dollarshillings);
        s.close();
    }
}
