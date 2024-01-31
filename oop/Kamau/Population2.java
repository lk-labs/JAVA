package oop.Kamau;

public class Population2 {
    public static void main(String[] args) {
        int population=14000000;
        double female=0.55*population;
        double male=(0.45*population);
        double femployed=0.25*female;
        double memployed=0.45*male;
        double funemployed=0.75*female;
        double munemployed=0.55*male;
        System.out.println("male population is"+male);
        System.out.println("female population"+female);
        System.out.println("unemployed female"+funemployed);
        System.out.println("unemployed male"+munemployed);
        System.out.println("employed male"+memployed);
        System.out.println("employed female"+femployed);
    }
}
