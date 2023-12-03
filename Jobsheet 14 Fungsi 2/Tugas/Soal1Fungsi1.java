import java.util.Scanner;

public class Soal1Fungsi1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Masukkan nilai n : ");
            n = sc.nextInt();
        } while (n < 0); 

        int pilihan;

        do {
            System.out.print("Silahkan pilih metode program (1 untuk iteratif, 2 untuk rekursif): ");
            pilihan = sc.nextInt();
        } while (pilihan != 1 && pilihan != 2); 

        if (pilihan == 1) {
            deretDescendingIteratif(n);
        } else if (pilihan == 2) {
            deretDescendingRekursif(n);
        } else {
            System.out.println("Pilihan tidak valid, mohon lakukan pemilihan ulang.");
        }
    }

    private static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    private static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
}
