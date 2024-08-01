import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int a = 1;

        for(int j = 1; j <= N; j++) {
            for (int i = 1; i <= N; i++) {
                System.out.print(a + " ");
                a++;
                if (a >= 10) {
                    a = 1;
                }
            }
            System.out.println();
        }
    }
}