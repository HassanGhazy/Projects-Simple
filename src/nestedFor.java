
import java.util.Scanner;


public class nestedFor {
     public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n1 = input.nextInt();
        for (int i = 1 ; i<=n1 ; i++){
            for (int ii = 0 ; ii<=n1 - i ; ii++){
                System.out.print("*");
            }
               System.out.println("");
 }
        for (int i = 0 ; i<= n1 ; i++){
         for (int ii = 0 ; ii<= i-1 ; ii++){
                    System.out.print("*");
}        System.out.println("");
}
    }}