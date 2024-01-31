package oop.Kamau.math;

public class Random {
    public static void main(String[] args) {
        System.out.println("CAT\tCAT2\tTCAT\tEXAM\tAGG\t");
        for (int x=1;x<=10;x++){
            int cat1=(int)(2+Math.ceil(Math.random()*10));
            int cat2=(int)(2+Math.ceil(Math.random()*15));
            int exam=(int)(Math.ceil(Math.random()*70));
            int tcat=cat1+cat2;
            int agg=tcat+exam;
            System.out.println(cat1+"\t"+cat2+"\t"+tcat+"\t"+exam+"\t"+agg);


        }
    }
}
