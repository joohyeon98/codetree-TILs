import java.util.Scanner;

public class Main {
    public static String yes(int n) {
        int first = n % 10;
        int second = n / 10;

        if ((n % 2 == 0) && ((first + second) % 5 == 0)) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(yes(n));
    }
}