
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter your number");
      int n = sc.nextInt();
      int temp =n;
       int rev =0;
     while (n>0){
   int digit = n%10;
  
   rev = rev *10 +digit;
   n =n/10;
     }
   if(temp==rev){
   System.out.println("number is a palindrome");
   }
   else{
    System.out.println("Number is not a palindrome");
   }
    }
}
