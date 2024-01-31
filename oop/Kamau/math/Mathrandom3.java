package oop.Kamau.math;
public class Mathrandom3{
    public static void main(String[] args) {
        System.out.println("radius\theight\tvolume\tsurface area");
        for(int i=1;i<=15;i++){
            int radius=(int)(25+Math.ceil(Math.random()*35));
            int height=(int)(50+Math.ceil(Math.random()*50));
            double pi=3.142;
            int diameter=2*radius;
            double volume=pi*radius*radius*height;
            double surfacearea=(pi*radius*radius)+(pi*diameter*height);
            System.out.println(radius+"\t"+height+"\t"+volume+"\t"+surfacearea);
        }
    }

}