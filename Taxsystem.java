import java.util.Scanner;
public class Taxsystem{
	
		static void taxfunction(int ohours,double Bsalary){
			Scanner input=new Scanner(System.in);
			System.out.println("enter your basic salary");
			Bsalary=input.nextDouble();
			System.out.println("enter your overtime hours");
			ohours=input.nextInt();
			double opay=0.00;
			if (ohours >=0 && ohours <=5){
				 opay=(ohours*500.00);
			}
			else if (ohours >5){
				opay=(5*500)+(ohours-5)*650.00;
			}
			double grosspay=opay+Bsalary;
			System.out.println("the grosssalary is"+grosspay);
			double paye=0.00;
			if (grosspay >100000){
				paye=0.3*grosspay;
			}
			else if (grosspay >=30000 && grosspay <=100000){
				paye=0.25*grosspay;
			}
			else if (grosspay <30000){
				paye=0.15*grosspay;
			}
			double netpay=grosspay-paye;
			System.out.println("the netpay is "+netpay);
		
		}
		
	public static void main (String []args){
		int ohours=0;
		double Bsalary=0.00;
		taxfunction( ohours, Bsalary);
	}
	
}
