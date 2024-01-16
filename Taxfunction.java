public class Taxfunction {
   static void tax(int ohours,int basicsalary) {
    int opay=0;    
    if (ohours >0 && ohours <=50) {
        opay=ohours*200;
    } else if (ohours>50) {
       opay=(200*ohours)+((ohours-50)*350) ; 
    }  
    double grosspay=opay+basicsalary;
    System.out.println("grosspay:"+grosspay);
    double paye;
    if (grosspay >=100000 && grosspay<=200000) {
        paye=0.8*grosspay;
    }
    else if (grosspay >=90000 && grosspay<100000) {
        paye=0.6*grosspay;
    }
    else if (grosspay >=80000 && grosspay<90000 ) {
       paye=0.4*grosspay; 
    }

    else if (grosspay>70000 && grosspay <90000 ) {
        paye=0.2*grosspay;
    }
    else{
        paye=0+grosspay;
    }
    double netpay;
    netpay=grosspay-paye;
    System.out.println("netpay:"+netpay);
}
   public static void main(String[]args) {
    tax(50, 100000);
   }
}
    


