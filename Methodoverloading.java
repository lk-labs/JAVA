public class Methodoverloading{
    static int Mymethodint(int x,int y){
        return x+y;
    }
    static double Mymethoddouble(double x,double y){
        return x+y;

    }
    public static void main(String[] args) {
        int mynum1=Mymethodint(10,20);
        double mynum2=Mymethoddouble(9.99,2.21);
        System.out.println("int:"+mynum1);
        System.out.println("double:"+mynum2);
    }
}
