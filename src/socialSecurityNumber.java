
import java.util.Scanner;


public class socialSecurityNumber {
    
  public static void main(String[] args) {
      System.out.println("Enter The Social Security number: ");
      Scanner input = new Scanner (System.in);
      String s = input.next();
       if (s.length()==6
               && Character.isUpperCase(s.charAt(0)) 
               && Character.isUpperCase(s.charAt(1)) 
               &&  Character.isDigit(s.charAt(2)) 
               && s.charAt(3)=='-' 
               && Character.isDigit(s.charAt(4))
               && Character.isDigit(s.charAt(5))
               )
               {
                   System.out.println("valid");
       }
       else System.out.println("not valid");
      
      
      }

}