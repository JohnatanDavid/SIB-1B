import java.util.Scanner;

public class Soal2Fungsi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyak angka untuk menghitung pola deret Fibonacci : ");
        int n = scanner.nextInt();

        System.out.println("Pola deret Fibonacci sebanyak " + n + " angka:");

        for (int i = 0; i < n; i++) {
            System.out.print(faktorialRekursif(i) + " ");
        }
    }

    public static int faktorialRekursif(int n) {
        if (n <= 1) {
            return n;
        } else {
            return faktorialRekursif(n - 1) + faktorialRekursif(n - 2);
        }
    }
}
