import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if ((1 <= N) && (N <= 100)) {
            for (int i = 0; i < N; i++) {
                System.out.println("12345^&*()_");
            }
        }
    }
}