import java.util.Scanner;

public class Main {
    public static int add(int N) {
        int j = 0;
        for (int i = 0; i <= N; i++) {
            j = j + i;
        }
        return j / 10;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        System.out.print(add(N));
    }
}