
import java.util.Scanner;
public class Reverse {
   static void reverse(int l, int r,int array[]){
if(l>=r){
    return;
}
int temp =array[l];
array[l] =array[r];
array[r] =temp;

reverse(l +1, r-1, array);
   } 
   public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("enter size of an array");
    int n = sc.nextInt();
       int array [] =new int[n];
       System.out.println("enter elements of an array");
       for(int i=0; i<n; i++){
        array[i]=sc.nextInt();
        }
       reverse(0,n-1, array);
       
       System.out.println("Reversed array:");
       for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
   }
}
