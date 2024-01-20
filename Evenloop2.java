public class Evenloop2 {
    public static void main(String[] args) {
        double sum=0;
        double avg=0;
        int count=0;
        for (int a =0;a<=100;a++){
            if (a%2==0) {
                System.out.println(a);
                sum+=a;
                count++;
            }
        }
//calculating average
avg=sum/count;
System.out.println("the sum is "+sum);
System.out.println("the average is "+avg);
        }

    }

