import java.util.Scanner;

public class Main {
    public static boolean year(int n) {
        if ((n % 4 == 0)) {
            if (n % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(year(n));
    }
}