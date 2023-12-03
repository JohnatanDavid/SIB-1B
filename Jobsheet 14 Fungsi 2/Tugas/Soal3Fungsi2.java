import java.util.Scanner;

public class Soal3Fungsi2 {

    public static void main(String[] args) {
        Scanner pindai = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan atau angka : ");
        int n = pindai.nextInt();

        if (PenjumlahanRekursif(n, 2)) {
            System.out.println(n + " merupakan bilangan prima.");
        } else {
            System.out.println(n + " bukan merupakan bilangan prima.");
        }
    }

    private static boolean PenjumlahanRekursif(int bil, int bagi) {
        if (bil <= 1) {
            return false;
        }
        if (bagi == bil) {
            return true;
        }
        if (bil % bagi == 0) {
            return false;
        }
        return PenjumlahanRekursif(bil, bagi + 1);
    }
}
