import java.util.Scanner;

public class Print1ToN {

    static void print(int i, int n) {

        if (i > n) {
            return;
        }

        System.out.println(i);

        print(i + 1, n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        print(1, n);
    }
}