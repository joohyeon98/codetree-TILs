import java.util.Scanner;

public class Main {
    public static int gcd(int n, int m) {
        if (n % m == 0) {
            return m;
        } else {
            return gcd(m, n % m);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int result = n * m / gcd(n, m);
        System.out.print(result);
    }
}