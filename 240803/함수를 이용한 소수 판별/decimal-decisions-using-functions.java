import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.print(sum);
    }
}