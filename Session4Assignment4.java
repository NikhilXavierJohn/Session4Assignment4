import java.util.Scanner;
public class Session4Assignment4 {
	
   public static void main(String[] args){
    Scanner name =new Scanner(System.in);
    System.out.print("Enter a String : ");
    String string= name.next();
    String reverse = new StringBuffer(string).
    reverse().toString();
    System.out.println("Given String : "+string);
    System.out.println("String after reversal:"+reverse);
   }
}
