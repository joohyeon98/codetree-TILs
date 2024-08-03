import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c) {
       if (a < b) {
        if (b < c) {
            return a;
        } else {
            if (a > c) {
                return c;
            } else {
                return a;
            }
        }
       } else {
        if (a < c) {
            return b;
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
       }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.print(min(a, b, c));
    }
}