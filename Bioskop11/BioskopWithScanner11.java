import java.util.Scanner;

public class BioskopWithScanner11 {
    
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n Menu:");
            System.out.println("1) Input data penonton");
            System.out.println("2) Tampilkan daftar penonton");
            System.out.println("3) Exit");
            System.out.print("Pilih Menu ( 1 / 2 / 3 ): ");
            int menu = sc.nextInt();
            sc.nextLine();

        switch (menu) {
            case 1:
            System.out.println("Siolahkan input data anda!\n");
            System.out.println("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.println("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.println("masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();
            
            if ( Pilihan (baris, kolom, penonton)) {
                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton telah terkonfirmasi.");
            } else {
                System.out.println("Kursi tidak tersedia. Mohon memilih kursi yang lain.");
            }
            break;

            case 2:
            System.out.println("Daftar Penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j]);
                            } else {
                                System.out.printf("Baris %d, Kolom %d: ***\n", i + 1, j + 1);
                            }
                        }
                    }
                    break;

            case 3:
                break;

            default:
            System.out.println("Mohon memilih antara nomer 1 sampai 3\n");
        }
        System.out.print("Kembali lagi ke menu? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            } 
        }
    }
    private static boolean Pilihan(int baris, int kolom, String[][] penonton) {
        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
            if (penonton[baris - 1][kolom - 1] == null) {
                return true; 
            } else {
                System.out.println("Mohon maaf Kursi telah terisi. Silahkan memilih kursi yang lain. Terimakasih ");
            }
        } else {
            System.out.println("Nomor kursi tidak valid, dimohon memilih nomor kursi yang tersedia");
        }
        return false; 
    }
}
