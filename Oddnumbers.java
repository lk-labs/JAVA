public class Oddnumbers {
    public static void main(String[] args) {
        int avg=0;
        int sum=0;
        int x=1;
        int count=0;
        while (x<=100){
            if (x%2!=0) {
                System.out.println(x);
                sum+=x;
                count++;
            }
            x++;
        }
 avg=sum/count;
 System.out.println("the sum is "+sum);
 System.out.println("the average is "+avg);           
            //calculating the average

        }
    }

