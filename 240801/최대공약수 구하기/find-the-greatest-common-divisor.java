import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int result = 0;

        if (n < m) {
            result = (m % n);
        } else {
            result = (n % m);
        }
        System.out.println(result);
    }
}