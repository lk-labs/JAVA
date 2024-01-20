import java.util.Scanner;
public class Prism{
	public static void main(String []args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the radius");
	int radius=s.nextInt();
	System.out.println("enter the height");
	int height=s.nextInt();
	double pi=3.14;
	double volume=pi*radius*radius*height;
	double Sarea=(2*pi*radius*radius)+(pi*radius*radius*height);
	System.out.println("the volume is  "+volume+"the surface is "+Sarea);
	
	}
}
