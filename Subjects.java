
import java.util.Scanner;

public class Subjects {
        public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        int count = 0;
        int subject=0;
        Scanner s = new Scanner(System.in);
        while (subject<=10){
            System.out.println("enter marks for subject 1 to 10");
            int marks=s.nextInt();
            sum+=marks;
            count++;
            subject++;
        }
        
    //calculate sum and average
    avg=sum/count;
    System.out.println("the sum is "+sum);
    System.out.println("the average is "+avg);


            }
        }
        

    

