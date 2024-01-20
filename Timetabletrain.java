import java.util.Scanner;
public class Timetabletrain {
    static void traintimetable(){
        String lecname="";
        String unitname="";
        int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the lechall");
        String lechall=s.nextLine();
        System.out.println("enter the timeslot");
        String timeslot=s.nextLine();
        System.out.println("enter the day ");
        String day=s.nextLine();

        if (lechall.equals("TH lab A")&& timeslot.equals("8.00-11.00")&& day.equals("tuesday") ){
            lecname="mutua katuku";
            unitname="database";
            flag=1;

            
        }
        else if (lechall.equals("OH lab A")&& timeslot.equals("9.00-12.00")&&day.equals("tuesday")) {
            lecname="Millicent omanga";
            unitname="oop1";
            flag=1;
            
        }
        else if (lechall.equals("RH lab C")&&timeslot.equals("12.00-14.00")&& day.equals("Friday")) {
            lecname="mirungi";
            unitname="ai";
            flag=1;

            
        }
        else if (lechall.equals("KH lab A")&&timeslot.equals("13.00-15.00")&&  day.equals("saturday")) {
            lecname="Kioko";
            unitname="oop2";
            flag=1;
        }
        if (flag==1){
            System.out.println("wow !free lecturer hall");
            System.out.println("lecname is "+lecname);
            System.out.println("unitname is "+unitname);

        }
        else if (flag==0) {
            System.out.println("no free lechall found");
        }
    }
        public static void main(String []args){
            traintimetable();


        }

    }
        
    

