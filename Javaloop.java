public class Javaloop {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int x=1;x<=100;x++){
            if (x%2==0) {
               System.out.println(x); 
               sum+=x;
               count++;
            }
        }
            double avg=sum/count;
            System.out.println("the sum of the numbers"+sum);
            System.out.println("the average is"+avg);
        }
    }


