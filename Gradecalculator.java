/*
 
 
 
 
 
 Write a C# program that takes a student's score as input and calculates the corresponding grade based on the following grading scale:
 
 A: 90-100
 B: 80-89
 C: 70-79
 D: 60-69
 F: 0-59
 The program should prompt the user to enter a score and then output the corresponding grade. Make sure to handle invalid input, such as a score less than 0 or greater than 100.
 
 
 */

import java.util.Scanner;
public class Gradecalculator{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=input.nextInt();
		while (marks <0 || marks >100){
			System.out.println("sorry enter the corect marks");
			System.out.println("re_enter the marks again");
			marks=input.nextInt();
		}
		if (marks >=90 && marks <=100){
			System.out.println("A");
		}
		else if (marks >=80 && marks <=89){
			System.out.println("B");
		}
		else if(marks >=70 && marks <=79){
			System.out.println("C");
			
		}
		else if (marks >=60 && marks<=69){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
	}
	
}
