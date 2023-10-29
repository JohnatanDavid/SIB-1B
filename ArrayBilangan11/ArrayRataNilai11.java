import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }
        
        double rataRataLulus = totalLulus / jumlahLulus;
        double rataRataTidakLulus = totalTidakLulus / jumlahTidakLulus;

        System.out.println("Rata-rata nilai lulus: " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataRataTidakLulus);
    }
}
