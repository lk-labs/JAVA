public class Switchmarks {
    public static void main(String[] args) {
        int marks =100;
        switch (marks/10){
            case 9:
            case 10:
              System.out.println("A");
              break;
            case 8:
              System.out.println("B");
              break;
            case  7:
              System.out.println("C");
              break;
            case 6:
              System.out.println("D"); 
              break;
            case 5:
              System.out.println("F");
              break;
              default:
                System.out.println("F");
              
        }
    }
}
