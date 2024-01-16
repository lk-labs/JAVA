public  class Gradingmethod{
    static void grades(int marks){
        if (marks >=70 && marks <=100){
            System.out.println("A");
        } 
         else if (marks >=60 && marks<=69) {
            System.out.println("B");
            
         } 
         else if (marks>=50 && marks<=59) {
            System.out.println("C");
         }
         else if (marks >=40 && marks <=49) {
            System.out.println("D");

         } 
         else{
            System.out.println("F");
         } 
        }
         public static void main(String[] args){
            grades(90);
         }
        }
    

