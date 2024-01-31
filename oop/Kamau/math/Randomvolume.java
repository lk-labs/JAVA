package oop.Kamau.math;

public class Randomvolume {
    public static void main(String[] args) {
        System.out.println("Length\twidth\theight\tSarea\tvolume ");
         for (int i=1;i<=10;i++){
            int Length=(int)(Math.ceil(Math.random()*20));
            int width=(int)(Math.ceil(Math.random()*15));
            int height=(int)(Math.ceil(Math.random()*30));
            int surfacearea=2*(Length*width)+2*(Length*height)+2*(height*width);
            int volume=Length*width*height;
            System.out.println(Length+"\t"+width+"\t"+height+"\t"+surfacearea+"\t"+volume);
         }
    }
}
