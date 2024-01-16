public class concacenation {
    public static void main(String[] args) {
    String fname="lucy";
    String lname="Mutuku";
   // System.out.println(fname+" "+lname);
   String txt="Hello i am so-called \"vikings\" from north eastern";//this is a special character for double quotes
   String rain="it\'s raining";
   String slash="this is a // baclslash";
   String name="Lucy\nMutuku";
   String school="CU\bEAEastern";
   System.out.println(fname.concat(lname));//this is a special character for a single qoute
   System.out.println(txt);
   System.out.println(rain);
   System.out.println(slash);
   System.out.println(name);
   System.out.println(school);
    }
}
/*\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed	
 */