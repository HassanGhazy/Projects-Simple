
import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
long Start = System.currentTimeMillis();
System.out.print("Enter the guess: ");
long number = input.nextInt();   

int number1 = (int)(Math.random()*101 + 1);
while (number!=number1){
    if (number==0){
        System.out.println(number1);
       System.out.print("Enter the guess: "); 
        number = input.nextInt();   }
if (number > number1){
    System.out.println("Your guess is too high ");
    System.out.print("Enter the guess: ");
    number = input.nextInt();
}
if (number < number1){
    System.out.println("Your guess is too low ");
    System.out.print("Enter the guess: ");
    number = input.nextInt();
}}

    System.out.println("Yes, the number is: " + number);
long End = System.currentTimeMillis();
long number2 = (End-Start)/1000;
        System.out.println("you take the " + number2 + " seconds to know the Answer");

    
}
    }