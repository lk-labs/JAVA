package oop.Kamau.math;
import java.util.Scanner;
public class MEthod {
 static   void volumemethod(){
    System.out.println("width\theight\tlength\tvolume");
        for (int x=1;x<=5;x++){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the height of the the cuboid");
        int height=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the width of the cuboid");
        int width=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the length of the cuboid ");
        int length=sc.nextInt();
        int volume=length*width*height;
        System.out.println(height+"\t"+width+"\t"+length+"\t"+volume);
        }
    }
        public static void main(String [] args){
            volumemethod();
        }

    }
