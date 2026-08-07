import java.util.Scanner;

public class PalinRecur {
    static  boolean f(int i, String s){
if(i >=s.length()/2){
    return true;
}
 if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
 return f(i + 1, s);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (f(0, s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
}
