package oop.basics;

public class MathRandom2 {
    public static void main(String[] args) {

        System.out.println("length\twidth\t height\tarea\tperimeter\tvolume");
        for(int i=1;i<=10;i++){
        int length=(int)(Math.ceil(Math.random()*20));
        int width=(int)(Math.ceil(Math.random()*30));
        int height=(int)(5+Math.ceil(Math.random()*17));
        int area=length*width;
        int perimeter=2*(length+width);
        int volume=length*width*height;
        System.out.println(length+"\t"+width+"\t"+height+"\t"+area+"\t"+perimeter+"\t"+volume);
        
    }
}
}
