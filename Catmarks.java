public class Catmarks {
    static void marks(int cat,int exam){
        int total_exam=cat+exam;
        System.out.println(total_exam);
        if (total_exam>=50) {
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }
    }
    public static void main(String[] args) {
        marks(30, 60);
    }
}
