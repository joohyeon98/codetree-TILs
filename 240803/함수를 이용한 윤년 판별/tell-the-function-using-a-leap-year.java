import java.util.Scanner;

public class Main {
    public static boolean year(int n) {
        if ((n % 4 != 0) && (n % 100 == 0)) {
            return false;
        }
        if (y % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(year(n));
    }
}