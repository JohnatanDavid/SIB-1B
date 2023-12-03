import java.util.Scanner;

public class Soal4Fungsi2 {

    public static void main(String[] args) {
        int bulan = 12;
        System.out.println("Bulan ke- | Pasangan Produktif  | tdk Produktif | Total Pasangan");
        System.out.println("--------------------------------------------------------------");
        
        for (int i = 1; i <= bulan; i++) {
            int[] hasil = hitung(i);
            System.out.println(i + "  \t  |" + hasil[0] + "\t\t\t| " + hasil[1] + "\t\t|" + (hasil[0] + hasil[1]));
        }
    }

    private static int[] hitung(int bulan) {
        if (bulan <= 2) {
            return new int[]{0, 1};
        } else {
            int[] BulanKe = hitung(bulan - 1);
            int pasanganProduktif = BulanKe[1];
            int pasanganTidakProduktif = BulanKe[0] + BulanKe[1];
            return new int[]{pasanganProduktif, pasanganTidakProduktif};
        }
    }
}
