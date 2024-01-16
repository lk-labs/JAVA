public class Oddnumber {
    public static void main(String[] args) {
        int a=1;
        int sum=0;
        double avg=0;
        int count=0;

        while (a<=100){
            if (a%2!=0) {
                System.out.println(a);
                sum+=a;
                count++;
            }
            a+=1;
        }
        avg=sum/count;
        System.out.println("the average is:"+sum);
        System.out.println("the average is:"+avg);
    }
}
