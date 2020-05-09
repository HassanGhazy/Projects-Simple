
public class haramNumber {
    
public static void main(String[] args){
int n = 3;
 for (int i = 1; i <= n; i++) {
 for (int j = 1; j <= n - i; j++) {
 System.out.print("\t");
 }
 for (int j = i; j >=1 ; j--) {
 System.out.print(j + "\t");
 }
 for (int j = 2; j <= i ; j++) {
 System.out.print(j + "\t");
 }
 System.out.println();
 }
}}  