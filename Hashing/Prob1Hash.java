
import java.util.Scanner;

public class Prob1Hash {
   public static void main(String[] args) {
      int counter = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter size of any array");
       int n = sc.nextInt();
       int array [] = new int[n];
       System.out.println("enter elements of an array");
       for (int i = 0; i < n; i++) {
           array[i]= sc.nextInt();
       }
     System.out.println("enter the number youu want to find its occurence");
       int x = sc.nextInt();
         for( int i =0; i<n; i++){
            if(array[i]==x){
        counter ++ ;
       }
    
    }
    System.out.println("the number you entered is " + counter + " times in the array");
   } 
}
