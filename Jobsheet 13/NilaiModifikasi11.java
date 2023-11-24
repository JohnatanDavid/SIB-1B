import java.util.Scanner;

public class NilaiModifikasi11 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahMahasiswa, jumlahTugas;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        System.out.print("Masukkan jumlah tugas per minggu: ");
        jumlahTugas = input.nextInt();

        String[] namaMahasiswa = new String[jumlahMahasiswa];
        int[][] nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        inputDataNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiMahasiswa);
        tampilkanHariNilaiTertinggi(namaMahasiswa, nilaiMahasiswa);
        tampilkanMahasiswaTerbaik(namaMahasiswa, nilaiMahasiswa);
    }

    static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();

            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        System.out.println("Nilai Mahasiswa:");
        System.out.printf("%-10s", "Nama");
        for (int i = 0; i < nilaiMahasiswa[0].length; i++) {
            System.out.printf("%-5s", "Minggu " + (i + 1));
        }
        System.out.println();

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                System.out.printf("%-5d", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void tampilkanHariNilaiTertinggi(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        int hariTerbaik = 0;
        int nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            int nilaiMingguIni = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                nilaiMingguIni += nilaiMahasiswa[i][j];
            }

            if (nilaiMingguIni > nilaiTertinggi) {
                nilaiTertinggi = nilaiMingguIni;
                hariTerbaik = j;
            }
        }

        System.out.println("Hari dengan nilai tertinggi adalah Minggu ke-" + (hariTerbaik + 1));
    }

    static void tampilkanMahasiswaTerbaik(String[] namaMahasiswa, int[][] nilaiMahasiswa) {
        int mahasiswaTerbaik = 0;
        int nilaiTertinggi = hitungTotalNilai(nilaiMahasiswa, 0);

        for (int i = 1; i < namaMahasiswa.length; i++) {
            int totalNilai = hitungTotalNilai(nilaiMahasiswa, i);
            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
                mahasiswaTerbaik = i;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTerbaik]);
        System.out.println("Detail Nilai:");

        for (int j = 0; j < nilaiMahasiswa[0].length; j++) {
            System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[mahasiswaTerbaik][j]);
        }
    }

    static int hitungTotalNilai(int[][] nilaiMahasiswa, int indeksMahasiswa) {
        int total = 0;
        for (int j = 0; j < nilaiMahasiswa[indeksMahasiswa].length; j++) {
            total += nilaiMahasiswa[indeksMahasiswa][j];
        }
        return total;
    }
}
