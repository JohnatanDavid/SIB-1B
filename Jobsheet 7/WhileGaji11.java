import java.util.Scanner;

public class WhileGaji11 {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        int jumlahKaryawan,jumlahJamLembur;
        double gajiLembur,totalGajiLembur;
        String jabatan;
         
            gajiLembur = 0;
            totalGajiLembur = 0;
        System.out.println("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = scan.nextInt();
    
    int i = 0;
    while (i < jumlahKaryawan) {
        System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
        System.out.println("Masukkan jabatan karyawan ke-" + (i+1) + ":");
        jabatan = scan.next();
        
        if (!(jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("Karyawan"))) {
            System.out.println("Jabatan invalid");
            continue;
        }
        System.out.println("Masukkan Jumlah Jam Lembur : ");
        jumlahJamLembur = scan.nextInt();
        i++;
        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manajer")) {
            gajiLembur = jumlahJamLembur * 100000;
        }
        else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLembur * 75000;
        }
        totalGajiLembur += gajiLembur;
    }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
        }
}
