import java.util.Scanner;
public class Employee{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter your length");
		int length=input.nextInt();
		//input.nextLine();
		
		System.out.println("enter your width");
		int width=input.nextInt();
		
		int area;
		int perimeter;
		area=length*width;
		perimeter=2*(length+width);
		
		System.out.println("the area is "+area+" the perimeter is "+perimeter);
		input.close();
	}
}
