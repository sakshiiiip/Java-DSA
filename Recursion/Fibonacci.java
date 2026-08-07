import java.util.Scanner;
public class Fibonacci {
    static void fibo(int n){
        int a = 0;
        int b = 1;
        if (n >= 1)
            System.out.print(a + " ");

        if (n >= 2)
            System.out.print(b + " ");
        for (int i = 2; i <n; i++) {
           int c = a+b;
        System.out.println(c + " ");
        a=b;
        b=c;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter No of Terms");
        int n = sc.nextInt();
        fibo(n);


    }
    }

