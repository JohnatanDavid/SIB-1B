import java.util.Scanner;

public class Fungsi2Soal1A {
    int n, total;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan besar nilai n : ");
                int n = sc.nextInt();
                int total = hitung(n);

        System.out.println("Total nilai : " + total);
    }

    private static int hitung(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
