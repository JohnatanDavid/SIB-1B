import java.util.Scanner;

public class Fungsi2Soal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lamanya inventasi (tahun) : ");
        int n = sc.nextInt();

        System.out.print("Masukkan jumlah uang awal investasi : ");
        double uangAwal = sc.nextDouble();

        double uangAkhir = hitung(uangAwal, n);

        System.out.println("Total banyaknya uang setelah " + n + " tahun sebesar : " + uangAkhir);
    }

    private static double hitung(double uangAwal, int n) {
        double keuntungan = 0.117; 
        double uangAkhir = uangAwal;

        for (int tahun = 1; tahun <= n; tahun++) {
            uangAkhir += uangAkhir * keuntungan;
        }
        return uangAkhir;
    }
}
