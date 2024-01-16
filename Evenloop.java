public class Evenloop {
    public static void main(String[] args) {
        int x=1;
        int sum=0;
        double avg=0;
        int count=0;

        while (x<=100){
            if (x%2==0) {
                System.out.println(x);
                sum+=x;
                count++;
            }
            x+=1;
        }
         avg= (double)sum/count;
        System.out.println("the sum is:"+sum);
        System.out.println("the average is:"+avg);
    }
}