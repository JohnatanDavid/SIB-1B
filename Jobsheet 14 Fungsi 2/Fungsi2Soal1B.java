import java.util.Scanner;

public class Fungsi2Soal1B {
    int n, total;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan besar nilai n: ");
            int n = sc.nextInt();
            int total = hitung2(n);

        System.out.println("Total nilai: " + total);
    }

    private static int hitung2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitung2(n - 1);
        }
    }
}
