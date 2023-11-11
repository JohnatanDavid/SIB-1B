import java.util.Scanner;

public class individu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N yang dimasukkan harus minimal 3!");
            return;
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        for (int i = 2; i <= N - 1; i++) {
            System.out.print(N + " ");
            for (int j = 2; j <= N - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(N);
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();
    }
}